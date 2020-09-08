package com.teenyda.controller.file.service;

import com.teenyda.common.GlobalErrorInfoException;
import com.teenyda.common.Util;
import com.teenyda.controller.file.exception.FileUploadException;
import com.teenyda.controller.file.property.FileProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Objects;

/**
 * @program: springboottemplate
 * @author:
 * @create: 2019-08-24 09:41
 * @description:
 * 原文
 * https://www.jianshu.com/p/e25b3c542553
 **/
@Service
public class FileService {

    public static final Logger LOGGER = LoggerFactory.getLogger(FileService.class);

    // 文件在本地存储的地址
    private final Path fileStorageLocation;

    @Autowired
    public FileService(FileProperties fileProperties) throws GlobalErrorInfoException {
        this.fileStorageLocation = Paths.get(fileProperties.getUploadDir())
                                    .toAbsolutePath().normalize();
        try {
            Files.createDirectories(this.fileStorageLocation);
        } catch (IOException e) {
            throw new GlobalErrorInfoException(FileUploadException.ERROR_CREATE_UPLOAD_FILE);
        }

    }

    /**
     * 存储文件到系统
     * @param file
     * @return
     * @throws GlobalErrorInfoException
     */
    public String saveToFile(MultipartFile file) throws GlobalErrorInfoException {
        // String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        String fileName = Util.getUUID() + Util.getSuffix(Objects.requireNonNull(file.getOriginalFilename()));
        try {


            Path targetLocation = this.fileStorageLocation.resolve(fileName);

            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

            String path = targetLocation.toAbsolutePath().toString();

            LOGGER.error(path);

            return fileName;

        } catch (IOException e) {
            throw new GlobalErrorInfoException(FileUploadException.ERROR_SAVE, file.getName());
        }
    }

    /**
     * 加载文件
     * @param fileName
     * @return
     */
    public Resource loadFileAsResource(String fileName) throws GlobalErrorInfoException {
        try {
            Path filePath = fileStorageLocation.resolve(fileName).normalize();
            Resource resource = new UrlResource(filePath.toUri());
            if (resource.exists()) {
                return resource;
            } else {
                throw new GlobalErrorInfoException(FileUploadException.ERROR_FOUND, fileName);
            }
        } catch (MalformedURLException e) {
            throw new GlobalErrorInfoException(FileUploadException.ERROR_FOUND, fileName);
        }
    }


}

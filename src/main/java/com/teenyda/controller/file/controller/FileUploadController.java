package com.teenyda.controller.file.controller;

import com.teenyda.common.GlobalErrorInfoEnum;
import com.teenyda.common.GlobalErrorInfoException;
import com.teenyda.common.ResultBody;
import com.teenyda.common.ResultUtil;
import com.teenyda.controller.file.dto.FileUploadResponse;
import com.teenyda.controller.file.service.FileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 * @program: springboottemplate
 * @author: Teenyda
 * @create: 2019-08-24 09:07
 * @description: 文件上传
 **/

@RestController()
@RequestMapping("/file")
public class FileUploadController {

    public static final Logger logger = LoggerFactory.getLogger(FileUploadController.class);

    @Autowired
    private FileService fileService;

    @PostMapping("/upload")
    public ResultBody<FileUploadResponse> uploadFile(@RequestParam("file") MultipartFile file) throws GlobalErrorInfoException {
        String fileName = fileService.saveToFile(file);
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/downloadFile/")
                .path(fileName)
                .toUriString();

        FileUploadResponse response = new FileUploadResponse(fileName, fileDownloadUri, file.getContentType(), file.getSize());
        return ResultUtil.success(GlobalErrorInfoEnum.SUCCESS, response);
    }


}

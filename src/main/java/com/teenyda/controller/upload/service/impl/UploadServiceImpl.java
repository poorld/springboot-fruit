package com.teenyda.controller.upload.service.impl;

import com.teenyda.dao.UploadDao;
import com.teenyda.controller.upload.dto.Upload;
import com.teenyda.controller.upload.service.UploadService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Upload)表服务实现类
 *
 * @author makejava
 * @since 2020-12-12 14:13:26
 */
@Service("uploadService")
public class UploadServiceImpl implements UploadService {
    @Resource
    private UploadDao uploadDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Upload queryById(Integer id) {
        return this.uploadDao.queryById(id);
    }

    @Override
    public Upload queryByLast() {
        return this.uploadDao.queryByLast();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Upload> queryAllByLimit(int offset, int limit) {
        return this.uploadDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param upload 实例对象
     * @return 实例对象
     */
    @Override
    public Upload insert(Upload upload) {
        this.uploadDao.insert(upload);
        return upload;
    }

    /**
     * 修改数据
     *
     * @param upload 实例对象
     * @return 实例对象
     */
    @Override
    public Upload update(Upload upload) {
        this.uploadDao.update(upload);
        return this.queryById(upload.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.uploadDao.deleteById(id) > 0;
    }
}
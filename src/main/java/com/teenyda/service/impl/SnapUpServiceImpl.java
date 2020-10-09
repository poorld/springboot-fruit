package com.teenyda.service.impl;

import com.teenyda.dao.SnapUpDao;
import com.teenyda.entity.SnapUp;
import com.teenyda.service.SnapUpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SnapUp)表服务实现类
 *
 * @author makejava
 * @since 2020-10-09 17:10:57
 */
@Service("snapUpService")
public class SnapUpServiceImpl implements SnapUpService {
    @Resource
    private SnapUpDao snapUpDao;

    /**
     * 通过ID查询单条数据
     *
     * @param snapUpId 主键
     * @return 实例对象
     */
    @Override
    public SnapUp queryById(Integer snapUpId) {
        return this.snapUpDao.queryById(snapUpId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<SnapUp> queryAllByLimit(int offset, int limit) {
        return this.snapUpDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param snapUp 实例对象
     * @return 实例对象
     */
    @Override
    public SnapUp insert(SnapUp snapUp) {
        this.snapUpDao.insert(snapUp);
        return snapUp;
    }

    /**
     * 修改数据
     *
     * @param snapUp 实例对象
     * @return 实例对象
     */
    @Override
    public SnapUp update(SnapUp snapUp) {
        this.snapUpDao.update(snapUp);
        return this.queryById(snapUp.getSnapUpId());
    }

    /**
     * 通过主键删除数据
     *
     * @param snapUpId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer snapUpId) {
        return this.snapUpDao.deleteById(snapUpId) > 0;
    }
}
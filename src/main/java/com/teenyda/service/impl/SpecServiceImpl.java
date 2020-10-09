package com.teenyda.service.impl;

import com.teenyda.dao.SpecDao;
import com.teenyda.entity.Spec;
import com.teenyda.service.SpecService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Spec)表服务实现类
 *
 * @author makejava
 * @since 2020-10-09 17:10:58
 */
@Service("specService")
public class SpecServiceImpl implements SpecService {
    @Resource
    private SpecDao specDao;

    /**
     * 通过ID查询单条数据
     *
     * @param specId 主键
     * @return 实例对象
     */
    @Override
    public Spec queryById(Integer specId) {
        return this.specDao.queryById(specId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Spec> queryAllByLimit(int offset, int limit) {
        return this.specDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param spec 实例对象
     * @return 实例对象
     */
    @Override
    public Spec insert(Spec spec) {
        this.specDao.insert(spec);
        return spec;
    }

    /**
     * 修改数据
     *
     * @param spec 实例对象
     * @return 实例对象
     */
    @Override
    public Spec update(Spec spec) {
        this.specDao.update(spec);
        return this.queryById(spec.getSpecId());
    }

    /**
     * 通过主键删除数据
     *
     * @param specId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer specId) {
        return this.specDao.deleteById(specId) > 0;
    }
}
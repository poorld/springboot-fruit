package com.teenyda.service.impl;

import com.teenyda.dao.DiscountsDao;
import com.teenyda.entity.Discounts;
import com.teenyda.service.DiscountsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Discounts)表服务实现类
 *
 * @author makejava
 * @since 2020-10-09 17:10:42
 */
@Service("discountsService")
public class DiscountsServiceImpl implements DiscountsService {
    @Resource
    private DiscountsDao discountsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param discountsId 主键
     * @return 实例对象
     */
    @Override
    public Discounts queryById(Integer discountsId) {
        return this.discountsDao.queryById(discountsId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Discounts> queryAllByLimit(int offset, int limit) {
        return this.discountsDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<Discounts> queryAll(Discounts discounts) {
        return this.discountsDao.queryAll(discounts);
    }

    /**
     * 新增数据
     *
     * @param discounts 实例对象
     * @return 实例对象
     */
    @Override
    public Discounts insert(Discounts discounts) {
        this.discountsDao.insert(discounts);
        return discounts;
    }

    /**
     * 修改数据
     *
     * @param discounts 实例对象
     * @return 实例对象
     */
    @Override
    public Discounts update(Discounts discounts) {
        this.discountsDao.update(discounts);
        return this.queryById(discounts.getDiscountsId());
    }

    /**
     * 通过主键删除数据
     *
     * @param discountsId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer discountsId) {
        return this.discountsDao.deleteById(discountsId) > 0;
    }
}
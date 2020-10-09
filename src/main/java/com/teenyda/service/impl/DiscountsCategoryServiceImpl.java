package com.teenyda.service.impl;

import com.teenyda.dao.DiscountsCategoryDao;
import com.teenyda.entity.DiscountsCategory;
import com.teenyda.service.DiscountsCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DiscountsCategory)表服务实现类
 *
 * @author makejava
 * @since 2020-10-09 17:10:44
 */
@Service("discountsCategoryService")
public class DiscountsCategoryServiceImpl implements DiscountsCategoryService {
    @Resource
    private DiscountsCategoryDao discountsCategoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param discountsCategoryId 主键
     * @return 实例对象
     */
    @Override
    public DiscountsCategory queryById(Integer discountsCategoryId) {
        return this.discountsCategoryDao.queryById(discountsCategoryId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<DiscountsCategory> queryAllByLimit(int offset, int limit) {
        return this.discountsCategoryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param discountsCategory 实例对象
     * @return 实例对象
     */
    @Override
    public DiscountsCategory insert(DiscountsCategory discountsCategory) {
        this.discountsCategoryDao.insert(discountsCategory);
        return discountsCategory;
    }

    /**
     * 修改数据
     *
     * @param discountsCategory 实例对象
     * @return 实例对象
     */
    @Override
    public DiscountsCategory update(DiscountsCategory discountsCategory) {
        this.discountsCategoryDao.update(discountsCategory);
        return this.queryById(discountsCategory.getDiscountsCategoryId());
    }

    /**
     * 通过主键删除数据
     *
     * @param discountsCategoryId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer discountsCategoryId) {
        return this.discountsCategoryDao.deleteById(discountsCategoryId) > 0;
    }
}
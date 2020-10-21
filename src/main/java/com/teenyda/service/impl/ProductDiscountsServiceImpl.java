package com.teenyda.service.impl;

import com.teenyda.dao.ProductDiscountsDao;
import com.teenyda.entity.ProductDiscounts;
import com.teenyda.service.ProductDiscountsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ProductDiscounts)表服务实现类
 *
 * @author makejava
 * @since 2020-10-09 17:10:55
 */
@Service("productDiscountsService")
public class ProductDiscountsServiceImpl implements ProductDiscountsService {
    @Resource
    private ProductDiscountsDao productDiscountsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param productId 主键
     * @return 实例对象
     */
    @Override
    public List<ProductDiscounts> queryById(Integer productId) {
        return this.productDiscountsDao.queryById(productId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<ProductDiscounts> queryAllByLimit(int offset, int limit) {
        return this.productDiscountsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param productDiscounts 实例对象
     * @return 实例对象
     */
    @Override
    public ProductDiscounts insert(ProductDiscounts productDiscounts) {
        this.productDiscountsDao.insert(productDiscounts);
        return productDiscounts;
    }

    /**
     * 修改用户优惠数据
     * 先删除再插入数据
     *
     * @param productDiscounts 实例对象
     * @param productId
     * @return 实例对象
     */
    @Override
    public Integer updateUserDiscounts(List<ProductDiscounts> productDiscounts, Integer productId) {
        int i = this.productDiscountsDao.deleteUserPDbyProductId(productId);
        if (productDiscounts.size() > 0)
            return this.productDiscountsDao.insertBatch(productDiscounts);

        // return this.queryById(productDiscounts.getProductId());
        return i;
    }

    @Override
    public Integer updateMemberDiscounts(List<ProductDiscounts> productDiscounts, Integer productId) {
        int i = this.productDiscountsDao.deleteMembersPDbyProductId(productId);

        if (productDiscounts.size() > 0)
            return this.productDiscountsDao.insertBatch(productDiscounts);

        // return this.queryById(productDiscounts.getProductId());
        return i;
    }

    /**
     * 通过主键删除数据
     *
     * @param productId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer productId) {
        return this.productDiscountsDao.deleteById(productId) > 0;
    }
}
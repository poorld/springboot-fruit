package com.teenyda.service.impl;

import com.teenyda.dao.NewProductDao;
import com.teenyda.entity.NewProduct;
import com.teenyda.service.NewProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (NewProduct)表服务实现类
 *
 * @author makejava
 * @since 2020-10-09 17:10:47
 */
@Service("newProductService")
public class NewProductServiceImpl implements NewProductService {
    @Resource
    private NewProductDao newProductDao;

    /**
     * 通过ID查询单条数据
     *
     * @param newProductId 主键
     * @return 实例对象
     */
    @Override
    public NewProduct queryById(Integer newProductId) {
        return this.newProductDao.queryById(newProductId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<NewProduct> queryAllByLimit(int offset, int limit) {
        return this.newProductDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param newProduct 实例对象
     * @return 实例对象
     */
    @Override
    public NewProduct insert(NewProduct newProduct) {
        this.newProductDao.insert(newProduct);
        return newProduct;
    }

    /**
     * 修改数据
     *
     * @param newProduct 实例对象
     * @return 实例对象
     */
    @Override
    public NewProduct update(NewProduct newProduct) {
        this.newProductDao.update(newProduct);
        return this.queryById(newProduct.getNewProductId());
    }

    /**
     * 通过主键删除数据
     *
     * @param newProductId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer newProductId) {
        return this.newProductDao.deleteById(newProductId) > 0;
    }
}
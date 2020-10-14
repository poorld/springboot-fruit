package com.teenyda.controller.sku.service;

import com.teenyda.dao.SkuDao;
import com.teenyda.entity.Sku;
import com.teenyda.controller.sku.service.SkuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Sku)表服务实现类
 *
 * @author makejava
 * @since 2020-10-14 19:59:46
 */
@Service("skuService")
public class SkuServiceImpl implements SkuService {
    @Resource
    private SkuDao skuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param skuId 主键
     * @return 实例对象
     */
    @Override
    public Sku queryById(Integer skuId) {
        return this.skuDao.queryById(skuId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Sku> queryAllByLimit(int offset, int limit) {
        return this.skuDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sku 实例对象
     * @return 实例对象
     */
    @Override
    public Sku insert(Sku sku) {
        this.skuDao.insert(sku);
        return sku;
    }

    /**
     * 修改数据
     *
     * @param sku 实例对象
     * @return 实例对象
     */
    @Override
    public Sku update(Sku sku) {
        this.skuDao.update(sku);
        return this.queryById(sku.getSkuId());
    }

    /**
     * 通过主键删除数据
     *
     * @param skuId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer skuId) {
        return this.skuDao.deleteById(skuId) > 0;
    }
}
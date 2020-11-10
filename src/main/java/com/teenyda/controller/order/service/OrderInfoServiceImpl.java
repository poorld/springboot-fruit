package com.teenyda.controller.order.service;

import com.teenyda.controller.order.dto.ProductSales;
import com.teenyda.dao.OrderInfoDao;
import com.teenyda.entity.OrderInfo;
import com.teenyda.controller.order.service.OrderInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (OrderInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-10-09 17:10:49
 */
@Service("orderInfoService")
public class OrderInfoServiceImpl implements OrderInfoService {
    @Resource
    private OrderInfoDao orderInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param orderNum 主键
     * @return 实例对象
     */
    @Override
    public OrderInfo queryById(String orderNum) {
        return this.orderInfoDao.queryById(orderNum);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<OrderInfo> queryAllByLimit(int offset, int limit) {
        return this.orderInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param orderInfo 实例对象
     * @return 实例对象
     */
    @Override
    public OrderInfo insert(OrderInfo orderInfo) {
        this.orderInfoDao.insert(orderInfo);
        return orderInfo;
    }

    /**
     * 修改数据
     *
     * @param orderInfo 实例对象
     * @return 实例对象
     */
    @Override
    public OrderInfo update(OrderInfo orderInfo) {
        this.orderInfoDao.update(orderInfo);
        return this.queryById(orderInfo.getOrderNum());
    }

    /**
     * 通过主键删除数据
     *
     * @param orderNum 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String orderNum) {
        return this.orderInfoDao.deleteById(orderNum) > 0;
    }


    @Override
    public ProductSales queryOrderSalesByCategoryId(Integer categoryId) {
        return orderInfoDao.productSales(categoryId);
    }
}
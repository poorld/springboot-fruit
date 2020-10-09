package com.teenyda.service.impl;

import com.teenyda.dao.OrderItemDao;
import com.teenyda.entity.OrderItem;
import com.teenyda.service.OrderItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (OrderItem)表服务实现类
 *
 * @author makejava
 * @since 2020-10-09 17:10:51
 */
@Service("orderItemService")
public class OrderItemServiceImpl implements OrderItemService {
    @Resource
    private OrderItemDao orderItemDao;

    /**
     * 通过ID查询单条数据
     *
     * @param orderItemId 主键
     * @return 实例对象
     */
    @Override
    public OrderItem queryById(String orderItemId) {
        return this.orderItemDao.queryById(orderItemId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<OrderItem> queryAllByLimit(int offset, int limit) {
        return this.orderItemDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param orderItem 实例对象
     * @return 实例对象
     */
    @Override
    public OrderItem insert(OrderItem orderItem) {
        this.orderItemDao.insert(orderItem);
        return orderItem;
    }

    /**
     * 修改数据
     *
     * @param orderItem 实例对象
     * @return 实例对象
     */
    @Override
    public OrderItem update(OrderItem orderItem) {
        this.orderItemDao.update(orderItem);
        return this.queryById(orderItem.getOrderItemId());
    }

    /**
     * 通过主键删除数据
     *
     * @param orderItemId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String orderItemId) {
        return this.orderItemDao.deleteById(orderItemId) > 0;
    }
}
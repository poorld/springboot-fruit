package com.teenyda.service;

import com.teenyda.entity.Wallet;

import java.util.List;

/**
 * (Wallet)表服务接口
 *
 * @author makejava
 * @since 2020-10-09 17:11:05
 */
public interface WalletService {

    /**
     * 通过ID查询单条数据
     *
     * @param walletId 主键
     * @return 实例对象
     */
    Wallet queryById(Integer userId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Wallet> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param wallet 实例对象
     * @return 实例对象
     */
    Wallet insert(Wallet wallet);

    /**
     * 修改数据
     *
     * @param wallet 实例对象
     * @return 实例对象
     */
    Wallet update(Wallet wallet);

    /**
     * 通过主键删除数据
     *
     * @param walletId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer walletId);

}
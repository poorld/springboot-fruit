package com.teenyda.service.impl;

import com.teenyda.dao.WalletDao;
import com.teenyda.entity.Wallet;
import com.teenyda.service.WalletService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Wallet)表服务实现类
 *
 * @author makejava
 * @since 2020-10-09 17:11:06
 */
@Service("walletService")
public class WalletServiceImpl implements WalletService {
    @Resource
    private WalletDao walletDao;

    /**
     * 通过ID查询单条数据
     *
     * @param walletId 主键
     * @return 实例对象
     */
    @Override
    public Wallet queryById(Integer walletId) {
        return this.walletDao.queryById(walletId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Wallet> queryAllByLimit(int offset, int limit) {
        return this.walletDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param wallet 实例对象
     * @return 实例对象
     */
    @Override
    public Wallet insert(Wallet wallet) {
        this.walletDao.insert(wallet);
        return wallet;
    }

    /**
     * 修改数据
     *
     * @param wallet 实例对象
     * @return 实例对象
     */
    @Override
    public Wallet update(Wallet wallet) {
        this.walletDao.update(wallet);
        return this.queryById(wallet.getWalletId());
    }

    /**
     * 通过主键删除数据
     *
     * @param walletId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer walletId) {
        return this.walletDao.deleteById(walletId) > 0;
    }
}
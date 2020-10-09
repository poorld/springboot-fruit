package com.teenyda.controller;

import com.teenyda.entity.Wallet;
import com.teenyda.service.WalletService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Wallet)表控制层
 *
 * @author makejava
 * @since 2020-10-09 17:11:06
 */
@RestController
@RequestMapping("wallet")
public class WalletController {
    /**
     * 服务对象
     */
    @Resource
    private WalletService walletService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Wallet selectOne(Integer id) {
        return this.walletService.queryById(id);
    }

}
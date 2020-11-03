package com.teenyda.controller.wallet.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.controller.wallet.dto.WalletDto;
import com.teenyda.entity.Wallet;
import com.teenyda.service.WalletService;
import com.teenyda.utils.CloneBeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Wallet)表控制层
 *
 * @author makejava
 * @since 2020-10-09 20:17:26
 */
@RestController
@RequestMapping("fruit")
public class WalletController extends AbstractApiController {
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
    @GetMapping("wallet/{userId}")
    public ResultBody<WalletDto> selectOne(@PathVariable("userId") Integer userId) {
        Wallet wallet = this.walletService.queryById(userId);
        WalletDto walletDto = CloneBeanUtils.copyProperties(wallet, WalletDto.class);
        return responseSuccessJson(walletDto);
    }

}
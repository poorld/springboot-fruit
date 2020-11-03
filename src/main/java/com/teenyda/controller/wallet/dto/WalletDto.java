package com.teenyda.controller.wallet.dto;

import lombok.Data;

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-11-03 12:31
 * @description: 钱包
 **/

@Data
public class WalletDto {

    private Integer walletId;

    private Integer userId;

    // 余额
    private Double balance;

}

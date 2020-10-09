package com.teenyda.mapping.base;

import java.util.List;

import com.teenyda.domain.Wallet;
/**
*  @author mymx.banner
*/
public interface WalletBaseMapper {

    int insertWallet(Wallet object);

    int updateWallet(Wallet object);

    int update(Wallet.UpdateBuilder object);

    List<Wallet> queryWallet(Wallet object);

    Wallet queryWalletLimit1(Wallet object);

}
package com.teenyda.dao;

import com.teenyda.entity.Wallet;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Wallet)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-09 17:11:05
 */
public interface WalletDao {

    /**
     * 通过ID查询单条数据
     *
     * @param walletId 主键
     * @return 实例对象
     */
    Wallet queryById(Integer walletId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Wallet> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param wallet 实例对象
     * @return 对象列表
     */
    List<Wallet> queryAll(Wallet wallet);

    /**
     * 新增数据
     *
     * @param wallet 实例对象
     * @return 影响行数
     */
    int insert(Wallet wallet);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Wallet> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Wallet> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Wallet> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Wallet> entities);

    /**
     * 修改数据
     *
     * @param wallet 实例对象
     * @return 影响行数
     */
    int update(Wallet wallet);

    /**
     * 通过主键删除数据
     *
     * @param walletId 主键
     * @return 影响行数
     */
    int deleteById(Integer walletId);

}
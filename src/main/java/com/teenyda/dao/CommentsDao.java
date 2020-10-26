package com.teenyda.dao;

import com.teenyda.entity.Comments;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Comments)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-09 17:10:37
 */
public interface CommentsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param commentsId 主键
     * @return 实例对象
     */
    Comments queryById(Integer commentsId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Comments> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param comments 实例对象
     * @return 对象列表
     */
    List<Comments> queryAll(Comments comments);


    List<Comments> selectByProductId(@Param("productId")int productId);
    Comments selectByProductIdLimit1(@Param("productId")int productId);

    /**
     * 新增数据
     *
     * @param comments 实例对象
     * @return 影响行数
     */
    int insert(Comments comments);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Comments> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Comments> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Comments> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Comments> entities);

    /**
     * 修改数据
     *
     * @param comments 实例对象
     * @return 影响行数
     */
    int update(Comments comments);

    /**
     * 通过主键删除数据
     *
     * @param commentsId 主键
     * @return 影响行数
     */
    int deleteById(Integer commentsId);

}
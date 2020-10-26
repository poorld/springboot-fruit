package com.teenyda.service;

import com.teenyda.entity.Comments;

import java.util.List;

/**
 * (Comments)表服务接口
 *
 * @author makejava
 * @since 2020-10-09 17:10:37
 */
public interface CommentsService {

    /**
     * 通过ID查询单条数据
     *
     * @param commentsId 主键
     * @return 实例对象
     */
    Comments queryById(Integer commentsId);

    List<Comments> queryByProductId(Integer productId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Comments> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param comments 实例对象
     * @return 实例对象
     */
    Comments insert(Comments comments);

    /**
     * 修改数据
     *
     * @param comments 实例对象
     * @return 实例对象
     */
    Comments update(Comments comments);

    /**
     * 通过主键删除数据
     *
     * @param commentsId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer commentsId);

}
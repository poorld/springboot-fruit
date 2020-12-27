package com.teenyda.service.impl;

import com.teenyda.controller.comments.dto.CommentsDto1;
import com.teenyda.dao.CommentsDao;
import com.teenyda.entity.Comments;
import com.teenyda.service.CommentsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Comments)表服务实现类
 *
 * @author makejava
 * @since 2020-10-09 17:10:38
 */
@Service("commentsService")
public class CommentsServiceImpl implements CommentsService {
    @Resource
    private CommentsDao commentsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param commentsId 主键
     * @return 实例对象
     */
    @Override
    public Comments queryById(Integer commentsId) {
        return this.commentsDao.queryById(commentsId);
    }

    @Override
    public List<Comments> queryByProductId(Integer productId) {
        return this.commentsDao.selectByProductId(productId);
    }

    @Override
    public Comments bestCommentsByProductId(Integer productId) {
        return this.commentsDao.selectByProductIdLimit1(productId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Comments> queryAllByLimit(int offset, int limit) {
        return this.commentsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param comments 实例对象
     * @return 实例对象
     */
    @Override
    public CommentsDto1 insert(CommentsDto1 comments) {
        this.commentsDao.insert(comments);
        return comments;
    }

    /**
     * 修改数据
     *
     * @param comments 实例对象
     * @return 实例对象
     */
    @Override
    public Comments update(Comments comments) {
        this.commentsDao.update(comments);
        return this.queryById(comments.getCommentsId());
    }

    /**
     * 通过主键删除数据
     *
     * @param commentsId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer commentsId) {
        return this.commentsDao.deleteById(commentsId) > 0;
    }
}
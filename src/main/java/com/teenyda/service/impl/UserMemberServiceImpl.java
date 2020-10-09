package com.teenyda.service.impl;

import com.teenyda.dao.UserMemberDao;
import com.teenyda.entity.UserMember;
import com.teenyda.service.UserMemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (UserMember)表服务实现类
 *
 * @author makejava
 * @since 2020-10-09 17:11:02
 */
@Service("userMemberService")
public class UserMemberServiceImpl implements UserMemberService {
    @Resource
    private UserMemberDao userMemberDao;

    /**
     * 通过ID查询单条数据
     *
     * @param 主键
     * @return 实例对象
     */
    @Override
    public UserMember queryById() {
        return this.userMemberDao.queryById();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<UserMember> queryAllByLimit(int offset, int limit) {
        return this.userMemberDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param userMember 实例对象
     * @return 实例对象
     */
    @Override
    public UserMember insert(UserMember userMember) {
        this.userMemberDao.insert(userMember);
        return userMember;
    }

    /**
     * 修改数据
     *
     * @param userMember 实例对象
     * @return 实例对象
     */
    @Override
    public UserMember update(UserMember userMember) {
        this.userMemberDao.update(userMember);
        return this.queryById(userMember.get());
    }

    /**
     * 通过主键删除数据
     *
     * @param 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById() {
        return this.userMemberDao.deleteById() > 0;
    }
}
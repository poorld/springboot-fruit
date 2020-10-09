package com.teenyda.service;

import com.teenyda.entity.UserMember;

import java.util.List;

/**
 * (UserMember)表服务接口
 *
 * @author makejava
 * @since 2020-10-09 17:11:02
 */
public interface UserMemberService {

    /**
     * 通过ID查询单条数据
     *
     * @param 主键
     * @return 实例对象
     */
    UserMember queryById(Integer userId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<UserMember> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param userMember 实例对象
     * @return 实例对象
     */
    UserMember insert(UserMember userMember);

    /**
     * 修改数据
     *
     * @param userMember 实例对象
     * @return 实例对象
     */
    UserMember update(UserMember userMember);

    /**
     * 通过主键删除数据
     *
     * @param 主键
     * @return 是否成功
     */
    boolean deleteById();

}
package com.teenyda.mapping.base;

import java.util.List;

import com.teenyda.dao.User;
/**
*  @author mymx.banner
*/
public interface UserBaseMapper {

    int insertUser(User object);

    int updateUser(User object);

    int update(User.UpdateBuilder object);

    List<User> queryUser(User object);

    User queryUserLimit1(User object);

}
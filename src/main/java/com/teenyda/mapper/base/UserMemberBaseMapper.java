package com.teenyda.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.teenyda.dao.UserMember;
/**
*  @author mymx.banner
*/
public interface UserMemberBaseMapper {

    int insertUserMember(UserMember object);

    int updateUserMember(UserMember object);

    int update(UserMember.UpdateBuilder object);

    List<UserMember> queryUserMember(UserMember object);

    UserMember queryUserMemberLimit1(UserMember object);

}
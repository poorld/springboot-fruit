package com.teenyda.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.teenyda.dao.Members;
/**
*  @author mymx.banner
*/
public interface MembersBaseMapper {

    int insertMembers(Members object);

    int updateMembers(Members object);

    int update(Members.UpdateBuilder object);

    List<Members> queryMembers(Members object);

    Members queryMembersLimit1(Members object);

}
package com.teenyda.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.teenyda.dao.Comments;
/**
*  @author mymx.banner
*/
public interface CommentsBaseMapper {

    int insertComments(Comments object);

    int updateComments(Comments object);

    int update(Comments.UpdateBuilder object);

    List<Comments> queryComments(Comments object);

    Comments queryCommentsLimit1(Comments object);

}
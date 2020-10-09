package com.teenyda.mapping.base;

import java.util.List;

import com.teenyda.domain.Comments;
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
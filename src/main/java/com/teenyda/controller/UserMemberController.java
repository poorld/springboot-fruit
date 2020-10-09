package com.teenyda.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.entity.UserMember;
import com.teenyda.service.UserMemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (UserMember)表控制层
 *
 * @author makejava
 * @since 2020-10-09 20:17:24
 */
@RestController
@RequestMapping("userMember")
public class UserMemberController extends AbstractApiController {
    /**
     * 服务对象
     */
    @Resource
    private UserMemberService userMemberService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ResultBody<UserMember> selectOne(id) {
        return responseSuccessJson(this.userMemberService.queryById(id));
    }

}
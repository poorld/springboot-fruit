package com.teenyda.controller;

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
 * @since 2020-10-09 17:11:04
 */
@RestController
@RequestMapping("userMember")
public class UserMemberController {
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
    public UserMember selectOne(id) {
        return this.userMemberService.queryById(id);
    }

}
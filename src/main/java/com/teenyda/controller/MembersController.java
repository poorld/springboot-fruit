package com.teenyda.controller;

import com.teenyda.entity.Members;
import com.teenyda.service.MembersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Members)表控制层
 *
 * @author makejava
 * @since 2020-10-09 17:10:46
 */
@RestController
@RequestMapping("members")
public class MembersController {
    /**
     * 服务对象
     */
    @Resource
    private MembersService membersService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Members selectOne(Integer id) {
        return this.membersService.queryById(id);
    }

}
package com.teenyda.controller;

import com.teenyda.entity.Contact;
import com.teenyda.service.ContactService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Contact)表控制层
 *
 * @author makejava
 * @since 2020-10-09 17:10:41
 */
@RestController
@RequestMapping("contact")
public class ContactController {
    /**
     * 服务对象
     */
    @Resource
    private ContactService contactService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Contact selectOne(Integer id) {
        return this.contactService.queryById(id);
    }

}
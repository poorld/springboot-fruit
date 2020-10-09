package com.teenyda.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
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
 * @since 2020-10-09 20:17:10
 */
@RestController
@RequestMapping("contact")
public class ContactController extends AbstractApiController {
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
    public ResultBody<Contact> selectOne(Integer id) {
        return responseSuccessJson(this.contactService.queryById(id));
    }

}
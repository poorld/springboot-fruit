package com.teenyda.controller.contact.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.entity.Contact;
import com.teenyda.controller.contact.service.ContactService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Contact)表控制层
 * 收货地址
 * @author makejava
 * @since 2020-10-09 20:17:10
 */
@RestController
@RequestMapping("fruit")
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
    // @GetMapping("contact/{contactId}")
    // public ResultBody<Contact> selectOne(@PathVariable("contactId")Integer id) {
    //     return responseSuccessJson(this.contactService.queryById(id));
    // }

    @GetMapping("contact/{userId}")
    public ResultBody<List<Contact>> contacts(@PathVariable("userId")Integer userId) {
        return responseSuccessJson(this.contactService.queryByUserId(userId));
    }

    @PostMapping("contact")
    public ResultBody<Contact> addContact(@RequestBody Contact contact) {
        return responseSuccessJson(this.contactService.insert(contact));
    }

    @PutMapping("contact")
    public ResultBody<Contact> updateContact(@RequestBody Contact contact) {
        return responseSuccessJson(this.contactService.update(contact));
    }

    @DeleteMapping("contact/{contactId}")
    public ResultBody<Boolean> deleteContact(@PathVariable("contactId") Integer id) {
        return responseSuccessJson(this.contactService.deleteById(id));
    }
}
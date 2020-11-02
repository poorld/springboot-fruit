package com.teenyda.controller.user.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.controller.user.dto.UserDto;
import com.teenyda.entity.User;
import com.teenyda.service.UserService;
import com.teenyda.utils.CloneBeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-10-09 20:17:23
 */
@RestController
@RequestMapping("fruit")
public class UserController extends AbstractApiController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("user/{userId}")
    public ResultBody<UserDto> selectOne(@PathVariable("userId") Integer id) {
        User user = this.userService.queryById(id);
        UserDto userDto = CloneBeanUtils.copyProperties(user, UserDto.class);
        return responseSuccessJson(userDto);
    }

}
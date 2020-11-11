package com.teenyda.controller.user.controller;

import com.teenyda.common.GlobalErrorInfoException;
import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.controller.user.dto.UserDto;
import com.teenyda.entity.User;
import com.teenyda.service.UserService;
import com.teenyda.utils.CloneBeanUtils;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("user/register")
    public ResultBody<Boolean> register(@RequestBody User user) throws GlobalErrorInfoException {
        User registerUser = userService.insert(user);
        return responseSuccessJson(true);
    }

    @PostMapping("user/login")
    public ResultBody<UserDto> login(@RequestBody User user) throws GlobalErrorInfoException {
        User loginUser = userService.queryByPassword(user);
        UserDto userDto = CloneBeanUtils.copyProperties(loginUser, UserDto.class);
        return responseSuccessJson(userDto);
    }

}
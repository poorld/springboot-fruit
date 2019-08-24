package com.teenyda.controller;

import com.teenyda.common.GlobalErrorInfoEnum;
import com.teenyda.common.ResultBody;
import com.teenyda.common.ResultUtil;
import com.teenyda.vo.BookVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboottemplate
 * @author: Teenyda
 * @create: 2019-07-07 22:16
 * @description:
 **/

@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping("/list")
    public ResultBody<BookVo> getBook() {
        BookVo bookVo = new BookVo();
        bookVo.setBookName("teenyda");
        return ResultUtil.success(GlobalErrorInfoEnum.SUCCESS, bookVo);
    }
}

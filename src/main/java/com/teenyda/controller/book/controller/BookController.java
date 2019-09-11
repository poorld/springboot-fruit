package com.teenyda.controller.book.controller;

import com.teenyda.common.GlobalErrorInfoEnum;
import com.teenyda.common.ResultBody;
import com.teenyda.common.ResultUtil;
import com.teenyda.controller.book.dto.BookDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: springboottemplate
 * @author: Teenyda
 * @create: 2019-07-07 22:16
 * @description:
 **/

@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping("/book")
    public ResultBody<BookDto> getBook() {
        BookDto bookVo = new BookDto();
        bookVo.setBookName("teenyda");
        return ResultUtil.success(GlobalErrorInfoEnum.SUCCESS, bookVo);
    }

    @GetMapping("/books")
    public ResultBody<List<BookDto>> getBooks() {
        BookDto bookVo1 = new BookDto();
        bookVo1.setBookName("teenyda");

        BookDto bookVo2 = new BookDto();
        bookVo2.setBookName("gg");

        List<BookDto> list = new ArrayList<>();
        list.add(bookVo1);
        list.add(bookVo2);

        return ResultUtil.success(GlobalErrorInfoEnum.SUCCESS, list);
    }
}

package com.teenyda.controller.book.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.controller.book.dto.BookDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.framework.AopContext;
import org.springframework.web.bind.annotation.*;

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
@Slf4j
public class BookController extends AbstractApiController {

    /**
     * 关于aop拦截抽象父类
     * https://blog.csdn.net/u014439693/article/details/106506177/
     * 使用例子 {@link BookController#updateBook(BookDto)}
     * 每个方法都要调用getProxyObject，太麻烦
     * 已解决，请查看/md/aop拦截父类不生效问题.md
     * @return AbstractApiController
     */
    private AbstractApiController getProxyObject() {
        return ((AbstractApiController) AopContext.currentProxy());
    }


    @GetMapping("/book")
    public ResultBody<BookDto> getBook() {
        BookDto bookVo = new BookDto();
        bookVo.setBookName("teenyda");
//        return ResultUtil.success(GlobalResponseInfoEnum.SUCCESS, bookVo);
        return responseSuccessJson(bookVo);
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

//        return ResultUtil.success(GlobalResponseInfoEnum.SUCCESS, list);
        return responseSuccessJson(list);
    }

    /**
     * aop测试
     * @param bookDto
     * @return
     */
    @PutMapping("/book")
    public ResultBody<BookDto> updateBook(@RequestBody BookDto bookDto) {
        log.info("BookDto={}", bookDto);
        // return getProxyObject().responseSuccessJson(bookDto);
        return responseSuccessJson(bookDto);
    }
}

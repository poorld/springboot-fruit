package com.teenyda.controller.book.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @program: springboottemplate
 * @author: Teenyda
 * @create: 2019-07-07 22:25
 * @description:
 **/

@ToString
public class BookDto {
    @Getter
    @Setter
    String bookName;

/*    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }*/

}

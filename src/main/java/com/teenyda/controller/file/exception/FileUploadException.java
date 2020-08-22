package com.teenyda.controller.file.exception;

import com.teenyda.common.ResponseInfoInterface;

/**
 * @program: springboottemplate
 * @author: Teenyda
 * @create: 2019-08-24 09:34
 * @description:
 **/
public enum FileUploadException implements ResponseInfoInterface {

    ERROR_PARAM(40001, "参数错误"),
    ERROR_SIZE_EXCEEDED(40002, "文件大小超出"),
    ERROR_CREATE_UPLOAD_FILE(40003, "创建上传目录失败"),
    ERROR_PATH(40004, "文件路径无效: %s"),
    ERROR_SAVE(40005, "无法保存文件 %s ,请重试"),
    ERROR_FOUND(40006, "文件没有找到 %s"),
    ;

    private int code;
    private String messaeg;
    private String explain;

    FileUploadException(int code, String messaeg) {
        this.code = code;
        this.messaeg = messaeg;
    }


    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return messaeg;
    }

    @Override
    public void setExplain(String explain) {
        this.explain = explain;
    }

    @Override
    public String getExplain() {
        return this.explain;
    }
}

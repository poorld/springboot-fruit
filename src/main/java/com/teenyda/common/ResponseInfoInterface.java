package com.teenyda.common;

/**
 * @Author Administrator
 * @Date 2019-01-06.
 * @Email teenyda@gmail.com
 */
public interface ResponseInfoInterface {

    /**
     * 参数错误
     */
    public static final int ERROR_PARAM = 40001;
    public static final String ERROR_PARAM_DESC = "参数错误";

    /**
     * 权限不足
     */
    public static final int ERROR_PERMISSION = 40002;
    public static final String ERROR_PERMISSION_DESC = "权限不足";

    /**
     * 用户未登陆
     */
    public static final int ERROR_LOGIN = 40003;
    public static final String ERROR_LOGIN_DESC = "用户未登陆";

    /**
     * 请求路径错误
     */
    public static final int ERROR_REQ_PATH = 40004;
    public static final String ERROR_REQ_PATH_DESC = "请求路径错误";

    /**
     * 请求路径错误
     */
    public static final int ERROR_UNKNOW = 40005;
    public static final String ERROR_UNKNOW_DESC = "未知错误";

    /**
     * 状态码
     * @return
     */
    int getCode();

    /**
     * 信息
     * @return
     */
    String getMessage();

    /**
     * 额外说明
     */
    void setExplain(String explain);

    String getExplain();
}



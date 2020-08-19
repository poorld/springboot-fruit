package com.teenyda.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author Administrator
 * @Date 2019-08-30.
 * @Email teenyda@gmail.com
 */
@Component
public class Util {

//    @Value("${server.port}")
    private static String port;
    @Value("${server.port}")
    public void setPort(String port){
        this.port = port;
    }

//    @LocalServerPort
//    private static String port;

//    @Value("${file.upload-dir}")
    private static String contextPath;
    @Value("${server.servlet.context-path}")
    public void setContextPath(String contextPath){
        this.contextPath = contextPath;
    }

    public static String resourcePath() {
        try {
            return ResourceUtils.getURL("classpath:").getPath();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static String localIP() {
        try {
            String host = InetAddress.getLocalHost().getHostAddress();
            return host;

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String lunchAddress() {
        return "http://" + localIP() + ":" + port + contextPath;
    }

}

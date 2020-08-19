package com.teenyda.common;

import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author Administrator
 * @Date 2019-08-30.
 * @Email teenyda@gmail.com
 */
public class Util {

    public static String resourcePath() {
        try {
            return ResourceUtils.getURL("classpath:").getPath();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static String lunchAddress() {
        try {
            String host = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "";
    }

}

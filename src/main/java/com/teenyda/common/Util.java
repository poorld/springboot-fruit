package com.teenyda.common;

import com.power.common.util.DateTimeUtil;
import com.power.common.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

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


    /**
     * 获取文件后缀
     */
    public static String getSuffix(String fileName){
        return fileName.substring(fileName.lastIndexOf("."),fileName.length());
    }

    /**
     * 获取UUID 32
     * @return
     */
    public static String getUUID() {
        return UUIDUtil.getUuid32();
    }

    public static String getNowDate(){
        return DateTimeUtil.nowStrTime();
    }

    public static String buildDownloadFilePath(String filename) {
        return lunchAddress() + "/file/downloadFile/" + filename;
    }

    public static String getOrderId() {
        return "I" + UUIDUtil.getUuid32();
    }

    public static String getOrderNumber() {
        return "O" + DateTimeUtil.nowStrTime(DateTimeUtil.YYYYMMDDHHMMSSSSS);
    }

    /**
     * 获取往后N分钟时间
     * @param date
     * @param minute
     * @return
     */
    public static Date getAfterMinutes(Date date, int minute) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, minute);
        return calendar.getTime();
    }
    /**
     * 提供精确加法计算的add方法
     * @param value1 被加数
     * @param value2 加数
     * @return 两个参数的和
     */
    public static double add(double value1,double value2){
        BigDecimal b1 = new BigDecimal(Double.valueOf(value1));
        BigDecimal b2 = new BigDecimal(Double.valueOf(value2));
        return b1.add(b2).doubleValue();
    }

    /**
     * 提供精确减法运算的sub方法
     * @param value1 被减数
     * @param value2 减数
     * @return 两个参数的差
     */
    public static double sub(double value1,double value2){
        BigDecimal b1 = new BigDecimal(Double.valueOf(value1));
        BigDecimal b2 = new BigDecimal(Double.valueOf(value2));
        return b1.subtract(b2).doubleValue();
    }

    /**
     * 提供精确乘法运算的mul方法
     * @param value1 被乘数
     * @param value2 乘数
     * @return 两个参数的积
     */
    public static double mul(double value1,double value2){
        BigDecimal b1 = new BigDecimal(value1);
        BigDecimal b2 = new BigDecimal(value2);
        return b1.multiply(b2).doubleValue();
    }
    public static double mul(int value1,double value2){
        BigDecimal b1 = new BigDecimal(Integer.valueOf(value1));
        BigDecimal b2 = new BigDecimal(Double.valueOf(value2));
        return b1.multiply(b2).doubleValue();
    }

    /**
     * 提供精确的除法运算方法div
     * @param value1 被除数
     * @param value2 除数
     * @param scale 精确范围
     * @return 两个参数的商
     * @throws IllegalAccessException
     */
    public static double div(double value1,double value2,int scale) throws IllegalAccessException{
        //如果精确范围小于0，抛出异常信息
        if(scale<0){
            throw new IllegalAccessException("精确度不能小于0");
        }
        BigDecimal b1 = new BigDecimal(Double.valueOf(value1));
        BigDecimal b2 = new BigDecimal(Double.valueOf(value2));
        return b1.divide(b2, scale).doubleValue();
    }

    public static int randomInt(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }

    public static float randomFloat() {
        Random random = new Random();
        return random.nextFloat();
    }

    public static double randomPrice(int bound) {
        int price = randomInt(bound);
        return add(price, scaleDouble(randomFloat(), 2));
    }

    /**
     * DecimalFormat转换
     * @param f
     * @return
     */
    public static String numberFormat(double f) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(f);
    }

    /**
     * 保留小数
     * @param f
     * @param scale 保留小数位数
     * @return
     */
    public static double scaleDouble(double f, int scale) {
        BigDecimal bg = new BigDecimal(f);
        return bg.setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}

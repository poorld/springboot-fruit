package com.teenyda.aspect;

import com.teenyda.common.ResultBody;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;


/**
 * 拦截HTTP响应
 * @Author Administrator
 * @Date 2020-08-22.
 * @Email teenyda@gmail.com
 */

@Aspect
@Component
@Slf4j
public class ResponseAspect {

    // ..表示方法里面的任何参数都会拦截.GirlController.*会拦截所有方法
    // 这里@Pointcut定义了一个切点，
    // PointCut中可以使用&&、||、!运算
    @Pointcut("execution(public * com.teenyda.controller.api.AbstractApiController+.*(..))")
    public void printInfo() {

    }

    @Before("printInfo()")    //方法执行之前,记录http请求
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();


        log.info("\n------------------request header--------------------");
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            log.info("|" + name + ":" + request.getHeader(name));
        }
        log.info("------------------request header----------------------");

        //url
        log.info("url={}", request.getRequestURL());

        //method
        log.info("method={}", request.getMethod());

        //ip
        log.info("ip={}", request.getRemoteAddr());

        //类方法
        log.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());

        //参数
        log.info("args={}", joinPoint.getArgs());
        log.info("--------------------request end-----------------------");
    }

    @After("printInfo()")
    public void doAfter() {
        // log.info("----------------------------------------");
    }

    @AfterReturning(returning = "object", pointcut = "printInfo()")
    public void doAfterReturning(Object object) {
        log.info("ResultBody={}", (ResultBody)object);
        log.info("----------------------------------------\n\n");
    }
}

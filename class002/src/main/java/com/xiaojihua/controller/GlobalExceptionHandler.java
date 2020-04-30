package com.xiaojihua.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.management.RuntimeErrorException;
import java.util.HashMap;
import java.util.Map;

/**
 * 知识点：
 * 1、全局捕获异常。
 * ControllerAdvice，是Controller的一个辅助类，用作全局异常处理的切面类
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)//确定要捕获的异常
    @ResponseBody//返回json。如果返回页面的话就返回spring。
    public Map<String,Object> resultError(){
        Map<String,Object> result = new HashMap<String, Object>();
        result.put("errCode","500");
        result.put("errMsg","系统错误");
        return result;
    }
}

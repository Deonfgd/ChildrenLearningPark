package com.fgd.learningpark.admin.intercept;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author: guodong.fang@luckincoffee.com
 * @Date: 2020/3/1 13:15
 */
@RestController
@ControllerAdvice
public class ClpControllerIntercept {

    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Exception e) {

        return "内部错误：" + e.getMessage();
    }

//    @ExceptionHandler(IOException.class)
//    public String businessHandler(IOException ie) {
//        return "内部错误：错误码-" + be.getCode();
//    }

}

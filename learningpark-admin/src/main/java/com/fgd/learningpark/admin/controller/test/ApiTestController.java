package com.fgd.learningpark.admin.controller.test;

import com.fgd.learningpark.common.base.Result;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: API：项目接口测试
 * @Author: guodong.fang@luckincoffee.com
 * @Date: 2020/2/23 02:34
 */
@RestController
@RequestMapping("parkTest")
public class ApiTestController {

    /**
     * 测试Bean是否为单例, 结果：是单例，由Spring容器维护生命周期
     */
    private int index = 0;

    /**
     * 无封装返回结果
     *
     * @param name 登陆人名
     * @return java.lang.String
     */
    @RequestMapping(value = "adminApi", method = RequestMethod.GET)
    public String apiStartTest(@RequestParam(required = false) String name) {
        index++;
        if (name == null) {
            return "无名氏，测试API成功, " + index + " 次";
        }
        return "Hi: " + name + "测试API成功, " + index + " 次";
    }

    /**
     * 包装返回结果
     *
     * @param name 登陆人名
     * @return com.fgd.learningpark.common.base.Result<java.lang.String>
     */
    @RequestMapping(value = "adminApiResult", method = RequestMethod.GET)
    public Result<String> apiStartTestResult(@RequestParam(required = false) String name) {
        if (name == null) {
            Result<String> testApiResult = new Result<>(Result.RESULT_SUCCESS, "登陆成功", "无名氏，测试API成功");
            return testApiResult;
        }
        Result<String> testApiResult = new Result<>(Result.RESULT_SUCCESS, "登陆成功", "Hi: " + name + "测试API成功");
        return testApiResult;
    }

}

package com.fgd.learningpark.common.base;

import java.io.Serializable;

/**
 * @Description: 返回结果封装
 * @Author: guodong.fang@luckincoffee.com
 * @Date: 2020/2/23 02:36
 */
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 3696784720109568389L;

    /**
     * 成功
     */
    public static final int RESULT_SUCCESS = 200;
    /**
     * 无权访问
     */
    public static final int RESULT_FORBIDDEN = 403;

    /**
     * 返回码
     */
    private int code;
    /**
     * 描述信息
     */
    private String msg;
    /**
     * 返回数据
     */
    private T data;

    public Result() {
    }

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Result error(int code, String msg) {
        return new Result<>(code, msg, null);
    }
}

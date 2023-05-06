package com.example.sidaodemo.response;

/**
 * @description:
 * @Author: JiangXia
 * @Date: 2022/4/3 5:20
 */
public interface CustomizeResultCode {
    /**
     * 获取错误状态码
     * @return 错误状态码
     */
    Integer getCode();

    /**
     * 获取错误信息
     * @return 错误信息
     */
    String getMessage();
}

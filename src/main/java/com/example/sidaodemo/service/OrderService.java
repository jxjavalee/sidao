package com.example.sidaodemo.service;

import com.example.sidaodemo.response.Result;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description:IntelliJ IDEA
 * @Author: JiangXia
 * @Date: 2023-05-06
 * @VERSION: 1.8
 */
@Mapper
public interface OrderService {

    Result list(Integer page, Integer pers);

    Result lastUserOder();

}



package com.example.sidaodemo.mapper;

import com.example.sidaodemo.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description:IntelliJ IDEA
 * @Author: JiangXia
 * @Date: 2023-05-06
 * @VERSION: 1.8
 */
public interface OrderMapper {
    List<Order> list(@Param("page") Integer page,@Param("pers") Integer pers);

    int count();

    List<Order> lastUserOrder(@Param("count") int count);
}


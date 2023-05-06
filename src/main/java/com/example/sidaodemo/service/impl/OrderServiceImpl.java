package com.example.sidaodemo.service.impl;

import com.example.sidaodemo.entity.Order;
import com.example.sidaodemo.mapper.OrderMapper;
import com.example.sidaodemo.response.Result;
import com.example.sidaodemo.service.OrderService;
import com.sun.corba.se.impl.oa.toa.TOA;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * @Description:IntelliJ IDEA
 * @Author: JiangXia
 * @Date: 2023-05-06
 * @VERSION: 1.8
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public Result list(Integer page, Integer pers) {
        int temp = 0;
        boolean hasNext = false;
        List<Order> list;
        if (page == 1) {
            list = orderMapper.list(0, pers);
        } else {
            temp = (page - 1)  * pers;
            list = orderMapper.list(temp, pers);
        }
        int total = orderMapper.count();
        if (page * pers < total) {
            hasNext = true;
        } else {
            hasNext = false;
        }
        System.out.println(list);
        return Result.ok().data("hasNext",hasNext).data("total", total).data("page", page).data("pers", pers).data("data", list);
    }

    @Override
    public Result lastUserOder() {
        int count = orderMapper.count();
        List<Order> list = orderMapper.lastUserOrder(count);
        return Result.ok().data("data",list);
    }
}


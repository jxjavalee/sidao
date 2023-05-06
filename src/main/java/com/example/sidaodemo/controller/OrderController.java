package com.example.sidaodemo.controller;

import com.example.sidaodemo.response.Result;
import com.example.sidaodemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 订单控制类
 * @Author: JiangXia
 * @Date: 2023-05-06
 * @VERSION: 1.8
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

   /**
   * @Author: JiangXia
   * @Description: 获取订单列表(分页)
   * @DateTime: 2023-05-06 23:58
   * @Params:
   * @Return
   */
    @PostMapping("/list")
    public Result list(Integer page, Integer pers){
        return orderService.list(page,pers);
    }

    /**
    * @Author: JiangXia
    * @Description: 获取每个用户最后一笔订单
    * @DateTime: 2023-05-07 00:14
    * @Params:
    * @Return
    */
    @GetMapping("/lastUserOrder")
    public Result lastUserOrder(){
        return orderService.lastUserOder();
    }
}


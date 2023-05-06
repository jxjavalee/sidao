package com.example.sidaodemo.entity;

import lombok.Data;

/**
 * @Description:IntelliJ IDEA
 * @Author: JiangXia
 * @Date: 2023-05-06
 * @VERSION: 1.8
 */
@Data
public class Order {
    private String id ;
    private String created_at;
    private String updated_at;
    private String deleted_at;
    private String user_id;
    private String product_name;
    private String total_price;
    private String count;
    private String unit_price;
    private String status;
    private String pay_type;
}


package com.example.sidaodemo.vo;

import lombok.Data;

/**
 * @Description:IntelliJ IDEA
 * @Author: JiangXia
 * @Date: 2023-05-07
 * @VERSION: 1.8
 */
@Data
public class OrderVo {
    private String id;
    private String created_at;
    private String updated_at;
    private String nickname;
    private String mobile;
    private String product_name;
    private String total_price;
    private String count;
    private String unit_price;
    private String status;
    private String pay_type;
}


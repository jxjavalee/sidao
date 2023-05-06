package com.example.sidaodemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.example.sidaodemo.mapper"})
public class SidaodemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SidaodemoApplication.class, args);
    }

}

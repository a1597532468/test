package com.example.mint;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.mint.dao")
public class MintApplication {

    public static void main(String[] args) {
        SpringApplication.run(MintApplication.class, args);
    }

}

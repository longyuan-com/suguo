package com.longyuan.sugou.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.longyuan.sugou.user.dao")
public class SuguoUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuguoUserApplication.class, args);
    }

}

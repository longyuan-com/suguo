package com.longyuan.suguo.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.longyuan.suguo.user.dao")
public class SuguoUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuguoUserServiceApplication.class, args);
    }

}

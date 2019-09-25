package com.longyuan.suguo.manage;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.longyuan.suguo.manage.dao")
public class SuguoManageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuguoManageServiceApplication.class, args);
    }

}

package com.zhshhypt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * author:cyz
 * 启动类
 */
@SpringBootApplication
@MapperScan("com.zhshhypt.mapper")
@ComponentScan(basePackages = {"com.zhshhypt.Controller","com.zhshhypt.mapper","com.zhshhypt.pojo","com.zhshhypt.service"})
public class MybatisprojectApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisprojectApplication.class, args);

    }
}

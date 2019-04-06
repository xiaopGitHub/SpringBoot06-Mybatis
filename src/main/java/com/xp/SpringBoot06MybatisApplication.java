package com.xp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @MapperScan(value="com.xp.mapper")批量扫描mapper
 * */
@MapperScan(value="com.xp.dao")
@SpringBootApplication
@EnableCaching    //开启redis缓存支持
public class SpringBoot06MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot06MybatisApplication.class, args);
    }

}


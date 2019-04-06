package com.xp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @MapperScan(value="com.xp.mapper")批量扫描mapper
* */
@MapperScan(value="com.xp.dao")
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot06MybatisApplicationTests {
    @Test
    public void contextLoads() {

    }

}


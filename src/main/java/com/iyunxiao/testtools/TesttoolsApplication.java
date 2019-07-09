package com.iyunxiao.testtools;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.iyunxiao.controller")
@ComponentScan("com.iyunxiao.security")
@ComponentScan("com.iyunxiao.service")
@MapperScan("com.iyunxiao.dao")
@SpringBootApplication
public class TesttoolsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesttoolsApplication.class, args);
	}

}

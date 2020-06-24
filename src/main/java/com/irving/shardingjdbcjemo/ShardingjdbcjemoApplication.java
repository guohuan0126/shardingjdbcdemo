package com.irving.shardingjdbcjemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.irving.shardingjdbcjemo.mapper"})
public class ShardingjdbcjemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShardingjdbcjemoApplication.class, args);
	}

}

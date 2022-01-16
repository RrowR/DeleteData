package com.study.delete;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.study.delete.mapper")
public class DeleteDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeleteDataApplication.class, args);
    }

}

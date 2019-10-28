package com.ouc.pces;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ouc.pces.mapper")
@SpringBootApplication
public class PcesApplication {

    public static void main(String[] args) {
        SpringApplication.run(PcesApplication.class, args);
    }

}

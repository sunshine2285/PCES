package com.ouc.pces;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableSwaggerBootstrapUI
@MapperScan("com.ouc.pces.mapper")
@SpringBootApplication
public class PcesApplication {

    public static void main(String[] args) {
        SpringApplication.run(PcesApplication.class, args);
    }

}

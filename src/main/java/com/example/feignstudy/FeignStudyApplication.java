package com.example.feignstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FeignStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignStudyApplication.class, args);
    }
}

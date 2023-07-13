package com.example.feignstudy.config;

import feign.Retryer;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class FeignRetry {

    @Bean
    public Retryer retryer() {
        return new Retryer.Default(100, 2000, 5);
    }
}

package com.example.feignstudy.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class FeignClient {

    @Bean
    public FeignErrorDecoder feignErrorDecoder(){
        return new FeignErrorDecoder();
    }

}

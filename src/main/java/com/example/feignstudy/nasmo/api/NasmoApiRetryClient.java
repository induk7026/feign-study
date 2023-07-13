package com.example.feignstudy.nasmo.api;

import com.example.feignstudy.config.FeignRetry;
import com.example.feignstudy.nasmo.api.request.LoginRequest;
import com.example.feignstudy.nasmo.api.response.UserLoginResponse;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "nasmoApiClient", url = "http://127.0.0.1:8081", configuration = {FeignRetry.class})
public interface NasmoApiRetryClient {

    @PostMapping("/login")
    @Headers({"Content-Type: application/json"})
    UserLoginResponse getUserNasmoById(@RequestBody LoginRequest loginRequest);
}

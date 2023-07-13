package com.example.feignstudy.nasmo.controller;

import com.example.feignstudy.nasmo.api.response.UserLoginResponse;
import com.example.feignstudy.nasmo.domain.Nasmo;
import com.example.feignstudy.nasmo.service.NasmoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NasmoApiController {

    private final NasmoService nasmoService;

    @GetMapping("/id")
    public Nasmo getId(){
        return nasmoService.getNasmoId(123456);
    }

    @GetMapping("/user_id")
    public Nasmo getUserId(){
        return nasmoService.getUserId();
    }

    @GetMapping("/retry_user_id")
    public UserLoginResponse getRetryUserId(){
        return nasmoService.retryUserId();
    }
}

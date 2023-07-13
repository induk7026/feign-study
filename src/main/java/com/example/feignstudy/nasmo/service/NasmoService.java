package com.example.feignstudy.nasmo.service;

import com.example.feignstudy.nasmo.api.NasmoApiClient;
import com.example.feignstudy.nasmo.api.NasmoApiRetryClient;
import com.example.feignstudy.nasmo.api.request.FindIdRequest;
import com.example.feignstudy.nasmo.api.request.FindUserIdRequest;
import com.example.feignstudy.nasmo.api.request.LoginRequest;
import com.example.feignstudy.nasmo.api.response.NasmoApiResponse;
import com.example.feignstudy.nasmo.api.response.UserLoginResponse;
import com.example.feignstudy.nasmo.domain.Nasmo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class NasmoService {
    private final NasmoApiClient nasmoApiClient;
    private final NasmoApiRetryClient nasmoApiRetryClient;

    public Nasmo getNasmoId(int id){
        NasmoApiResponse nasmoApiResponse = nasmoApiClient.getNasmoId(FindIdRequest.builder().value(id).build());
        return nasmoApiResponse.getBody();
    }

    public Nasmo getUserId(){
        NasmoApiResponse nasmoApiResponse = nasmoApiClient.getUserNasmoById(
            FindUserIdRequest.builder().nasmoId(270748).userNo(943369).build()
        );
        return nasmoApiResponse.getBody();
    }

    public UserLoginResponse retryUserId(){
        UserLoginResponse nasmoApiResponse = nasmoApiRetryClient.getUserNasmoById(
            new LoginRequest("2222@email.com","pw")
        );
        return nasmoApiResponse;
    }
}

package com.example.feignstudy.nasmo.api;

import com.example.feignstudy.nasmo.api.request.FindIdRequest;
import com.example.feignstudy.nasmo.api.request.FindUserIdRequest;
import com.example.feignstudy.nasmo.api.response.NasmoApiResponse;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "nasmoApiClient", url = "${external.url.nasmo}")
public interface NasmoApiClient {

    @PostMapping("/id")
    @Headers({"Content-Type: application/json"})
    NasmoApiResponse getNasmoId(@RequestBody FindIdRequest findIdRequest);

    @PostMapping("/video-id")
    @Headers({"Content-Type: application/json"})
    NasmoApiResponse getVideoId(@RequestBody FindIdRequest findIdRequest);

    @PostMapping("/user-id")
    @Headers({"Content-Type: application/json"})
    NasmoApiResponse getUserNasmoById(@RequestBody FindUserIdRequest findUserIdRequest);
}

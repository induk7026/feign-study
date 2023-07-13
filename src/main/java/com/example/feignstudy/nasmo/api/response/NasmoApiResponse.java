package com.example.feignstudy.nasmo.api.response;

import com.example.feignstudy.nasmo.domain.Nasmo;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class NasmoApiResponse extends ApiStatusResponse {
    private int statusCode;
    private Nasmo body;

    public Boolean isOk(){
        return statusCode == 200;
    }

    public Boolean isFail(){
        return !isOk();
    }

}

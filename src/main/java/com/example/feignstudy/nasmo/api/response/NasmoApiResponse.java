package com.example.feignstudy.nasmo.api.response;

import com.example.feignstudy.nasmo.domain.Nasmo;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class NasmoApiResponse {
    private int statusCode;
    private Nasmo body;

}

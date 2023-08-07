package com.example.feignstudy.nasmo.api.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteNasmoResponse {


    private int statusCode;
    private int body;
}

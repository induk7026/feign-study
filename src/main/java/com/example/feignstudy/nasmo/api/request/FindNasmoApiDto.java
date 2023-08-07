package com.example.feignstudy.nasmo.api.request;

import com.example.feignstudy.nasmo.api.response.NasmoListDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FindNasmoApiDto {

    private Integer statusCode;
    private List<NasmoListDto> body = new ArrayList<NasmoListDto>();

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public List<NasmoListDto> getBody() {
        return body;
    }

    public void setBody(List<NasmoListDto> body) {
        this.body = body;
    }
}

package com.example.feignstudy.nasmo.api.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateShareFlagResponse {

    private int statusCode;
    private List<Body> body;

    public static class Body {
        private int res;
    }
}

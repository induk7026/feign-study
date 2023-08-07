package com.example.feignstudy.nasmo.api.response;

import com.example.feignstudy.nasmo.domain.AcademyNasmo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class NasmoVideoViewResponse {

    private int statusCode;
    private List<Body> body;

    public AcademyNasmo convert(){
        return AcademyNasmo.builder()
                .videoUrl(this.body.get(0).videoUrl)
                .build();
    }
    @Getter
    @Setter
    public static class Body {
        private String videoUrl;
    }
}

package com.example.feignstudy.shot.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShotApiCountDto {

    private int statusCode;
    private List<Ga2DataCount> body;
    @Getter
    @Setter
    public static class Ga2DataCount{
        private Long cnt;
    }

}

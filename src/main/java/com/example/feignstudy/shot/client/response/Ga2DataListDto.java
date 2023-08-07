package com.example.feignstudy.shot.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ga2DataListDto {

    private int statusCode;
    private List<Ga2DataList> body;

    @Getter
    @Setter
    public static class Ga2DataList {
        private String setDistance;
        private String ipDistanceTb;
        private String ipDistanceOut;
        private String headSpeed;
        private String distance;
        private String carry;
        private String ballSpeed;
        private String angle;
    }
}

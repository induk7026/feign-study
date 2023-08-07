package com.example.feignstudy.shot.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ga2DataDto {

    private int statusCode;
    private List<Ga2Data> body;
    @Getter
    @Setter
    public static class Ga2Data{
        private int shotType;
        private Float setDistance;
        private Float ipDistance;
        private Float ipDistanceTb;
        private Float ipDistanceOut;
        private Float ballSpeed;
        private Float distance;
    }

}

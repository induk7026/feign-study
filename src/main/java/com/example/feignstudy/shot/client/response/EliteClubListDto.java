package com.example.feignstudy.shot.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class EliteClubListDto {


    private List<EliteClub> body;
    private int statusCode;
    private String errorMessage;
    private String errorType;
    private List<String> stackTrace;

    @Getter
    @Setter
    public static class EliteClub {
        private int setDistance;
        private double ipDistanceTb;
        private int ipDistanceOut;
        private int distance;
    }
}

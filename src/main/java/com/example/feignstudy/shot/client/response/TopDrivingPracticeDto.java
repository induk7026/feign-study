package com.example.feignstudy.shot.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class TopDrivingPracticeDto{

    private int statusCode;
    private List<TopDrivingPractice> body;

    @Getter
    @Setter
    public static class TopDrivingPractice{
        private Float distanceAvg;
        private int totalCnt;
        private int excellentShotCnt;
        private int niceShotCnt;
        private String date;
        private int ballStraight;
        private int ballRight;
        private int ballLeft;
        private int club;
    }


}

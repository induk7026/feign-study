package com.example.feignstudy.shot.client.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TopDrivingPracticeShotLocationDto{

    private int statusCode;
    private List<TopDrivingPracticeShotLocation> body;

    @Getter
    @Setter
    public static class TopDrivingPracticeShotLocation{
        private int shotType;
        private int ipDistance;
        private int distance;
        private int ipDistanceOut;
        private int ipDistanceTb;

    }
}

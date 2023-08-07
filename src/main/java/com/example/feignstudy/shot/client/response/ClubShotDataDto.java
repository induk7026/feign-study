package com.example.feignstudy.shot.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClubShotDataDto{

    private int statusCode;
    private List<ClubShotData> body;
    @Getter
    @Setter
    public static class ClubShotData{
        @JsonProperty("spin_side")
        private int spinSide;
        @JsonProperty("spin_back")
        private int spinBack;
        @JsonProperty("rownum")
        private int rownum;
        @JsonProperty("ip_distance_tb")
        private int ipDistanceTb;
        @JsonProperty("distance")
        private int distance;
        @JsonProperty("direction_angle")
        private int directionAngle;
        @JsonProperty("carry")
        private int carry;
        @JsonProperty("ball_speed")
        private int ballSpeed;
        @JsonProperty("ball_angle")
        private int ballAngle;
    }
}

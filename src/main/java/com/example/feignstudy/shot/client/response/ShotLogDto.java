package com.example.feignstudy.shot.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShotLogDto {

    private List<ShotLog> body;
    private int statusCode;

    private String errorMessage;
    private String errorType;
    private List<String> stackTrace;

    public static class ShotLog {
        @JsonProperty("ts_code")
        private int tsCode;
        @JsonProperty("training_point_useyn")
        private boolean trainingPointUseyn;
        @JsonProperty("top_height")
        private int topHeight;
        @JsonProperty("top_distance")
        private int topDistance;
        @JsonProperty("tm_code")
        private int tmCode;
        @JsonProperty("tl_uicode")
        private int tlUicode;
        @JsonProperty("swing_path")
        private int swingPath;
        @JsonProperty("success_yn")
        private boolean successYn;
        @JsonProperty("spin_side")
        private int spinSide;
        @JsonProperty("spin_back")
        private int spinBack;
        @JsonProperty("shot_type")
        private int shotType;
        @JsonProperty("shot_seq")
        private int shotSeq;
        @JsonProperty("shot_order")
        private int shotOrder;
        @JsonProperty("shot_date")
        private String shotDate;
        @JsonProperty("set_distance")
        private int setDistance;
        @JsonProperty("max_curve")
        private int maxCurve;
        @JsonProperty("lie_code")
        private int lieCode;
        @JsonProperty("ip_distance_tb")
        private int ipDistanceTb;
        @JsonProperty("ip_distance_out")
        private int ipDistanceOut;
        @JsonProperty("ip_distance")
        private int ipDistance;
        @JsonProperty("head_speed")
        private int headSpeed;
        @JsonProperty("ground_code")
        private int groundCode;
        @JsonProperty("green_speed_code")
        private int greenSpeedCode;
        @JsonProperty("fly_time")
        private int flyTime;
        @JsonProperty("face_angle")
        private int faceAngle;
        @JsonProperty("distance")
        private int distance;
        @JsonProperty("direction_angle")
        private int directionAngle;
        @JsonProperty("clubcode")
        private int clubCode;
        @JsonProperty("club_cognition")
        private int clubCognition;
        @JsonProperty("club")
        private int club;
        @JsonProperty("carry")
        private int carry;
        @JsonProperty("ball_speed")
        private int ballSpeed;
        @JsonProperty("ball_path_sub_code")
        private int ballPathSubCode;
        @JsonProperty("ball_path_code")
        private int ballPathCode;
        @JsonProperty("ball_angle")
        private int ballAngle;
    }
}

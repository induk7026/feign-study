package com.example.feignstudy.shot.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class DrivingShotDataDto {

    private int statusCode;
    private List<DrivingShotData> body;

    @Getter
    @Setter
    public static class DrivingShotData{
        private int tsCode;
        private int club;
        private int setDistance;
        private int distance;
        private int carry;
        private int spinBack;
        private int spinSide;
        private int ipDistance;
        private int ipDistanceOut;
        private int ipDistanceTb;
        private int ballSpeed;
        private int ballAngle;
        private int headSpeed;
        private int topHeight;
        private int flyTime;
        private int directionAngle;
        private int faceAngle;
        private int ballPathCode;
        private int swingPath;
        private SensorVersion b;

        public class SensorVersion {
            private int sensorVersion;
        }
    }

}

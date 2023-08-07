package com.example.feignstudy.nasmo.api.response;

import com.example.feignstudy.nasmo.domain.AcademyNasmo;
import com.example.feignstudy.nasmo.domain.Nasmo;
import com.example.feignstudy.nasmo.domain.TopDrivingNasmo;
import com.example.feignstudy.util.DateUtil;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class TopDrivingNasmoShotResponse {


    private int statusCode;
    private List<TopDrivingNasmoShot> body;

    public TopDrivingNasmo convert(){
        return this.body.stream().findFirst().get().convert();
    }

    @Getter
    @Setter
    public static class TopDrivingNasmoShot {
        private int videoId;
        private Float topHeight;
        private Long swingResultId;
        private int spinSide;
        private int spinBack;
        private int shotFlag;
        private Float setDistance;
        private int reqStatus;
        private Float ipDistanceOut;
        private String imageFilePath;
        private String imageFileName;
        private String filePath;
        private String fileName;
        private Float faceAngle;
        private Float distance;
        private Float directionAngle;
        private int dateTimeStamp;
        private String date;
        private int club;
        private Float carry;
        private Float ballSpeed;
        private int ballPathCode;
        private Float ballAngle;

        public TopDrivingNasmo convert(){
            return TopDrivingNasmo.builder()
                    .videoId(this.videoId)
                    .topHeight(this.topHeight)
                    .swingResultId(this.swingResultId)
                    .spinSide(this.spinSide)
                    .spinBack(this.spinBack)
                    .shotFlag(this.shotFlag)
                    .setDistance(this.setDistance)
                    .reqStatus(this.reqStatus)
                    .ipDistanceOut(this.ipDistanceOut)
                    .imageFilePath(this.imageFilePath)
                    .imageFileName(this.imageFileName)
                    .filePath(this.filePath)
                    .fileName(this.fileName)
                    .faceAngle(this.faceAngle)
                    .distance(this.distance)
                    .directionAngle(this.directionAngle)
                    .dateTimeStamp(String.valueOf(this.dateTimeStamp))
                    .date(DateUtil.defaltParseAsDate(this.date))
                    .club(this.club)
                    .carry(this.carry)
                    .ballSpeed(this.ballSpeed)
                    .ballPathCode(this.ballPathCode)
                    .ballAngle(this.ballAngle)
                    .build();
        }

        public AcademyNasmo nasmoConvert(){
            return AcademyNasmo.builder()
                    .videoId(this.videoId)
                    .topHeight(this.topHeight.intValue())
                    .swingResultId(this.swingResultId)
                    .spinSide(this.spinSide)
                    .spinBack(this.spinBack)
                    .shotFlag(this.shotFlag)
                    .setDistance(this.setDistance.intValue())
                    .reqStatus(this.reqStatus)
                    .ipDistanceOut(this.ipDistanceOut.intValue())
                    .imageFilePath(this.imageFilePath)
                    .imageFileName(this.imageFileName)
                    .filePath(this.filePath)
                    .fileName(this.fileName)
                    .faceAngle(this.faceAngle)
                    .distance(this.distance)
                    .directionAngle(this.directionAngle.intValue())
                    .dateTimeStamp(String.valueOf(this.dateTimeStamp))
                    .date(this.date)
                    .club(this.club)
                    .carry(this.carry.intValue())
                    .ballSpeed(this.ballSpeed)
                    .ballPathCode(this.ballPathCode)
                    .ballAngle(this.ballAngle)
                    .build();
        }
    }
}

package com.example.feignstudy.nasmo.api.response;

import com.example.feignstudy.nasmo.domain.AcademyNasmo;
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
public class TopDrivingNasmoListResponse {

    private List<TopDrivingNasmoDto> body;
    private int statusCode;

    public List<TopDrivingNasmo> converts(){
        return this.body.stream().map(
                TopDrivingNasmoDto::convert
        ).collect(Collectors.toList());
    }

    public List<AcademyNasmo> nasmoConverts(){
        return this.body.stream().map(TopDrivingNasmoDto::nasmoConvert)
                .collect(Collectors.toList());
    }
    @Getter
    @Setter
    public static class TopDrivingNasmoDto {
        private int viewType;
        private int shotFlag;
        private int nasmoId;
        private String imageFilePath;
        private String imageFileName;
        private String filePath;
        private String fileName;
        private Float distance;
        private String date;
        private int club;
        private int ballPathCode;
        private int dateTimeStamp;
        private int reqStatus;

        public TopDrivingNasmo convert(){
            return TopDrivingNasmo.builder()
                .viewType(this.viewType)
                .shotFlag(this.shotFlag)
                .nasmoId(this.nasmoId)
                .imageFilePath(this.imageFilePath)
                .imageFileName(this.imageFileName)
                .filePath(this.filePath)
                .fileName(this.fileName)
                .distance(this.distance)
                .date(DateUtil.defaltParseAsDate(this.date))
                .club(this.club)
                .ballPathCode(this.ballPathCode)
                .build();
        }

        public AcademyNasmo nasmoConvert(){
            return AcademyNasmo.builder()
                    .viewType(this.viewType)
                    .shotFlag(this.shotFlag)
                    .nasmoId(this.nasmoId)
                    .imageFilePath(this.imageFilePath)
                    .imageFileName(this.imageFileName)
                    .filePath(this.filePath)
                    .fileName(this.fileName)
                    .distance(this.distance)
                    .date(this.date)
                    .club(this.club)
                    .ballPathCode(this.ballPathCode)
                    .viewType(this.viewType)
                    .dateTimeStamp(String.valueOf(this.dateTimeStamp))
                    .reqStatus(this.reqStatus)
                    .build();
        }
    }
}

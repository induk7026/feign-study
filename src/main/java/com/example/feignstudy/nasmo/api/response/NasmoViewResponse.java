package com.example.feignstudy.nasmo.api.response;

import com.example.feignstudy.nasmo.domain.AcademyNasmo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class NasmoViewResponse {


    private List<Body> body;
    private int statusCode;

    public AcademyNasmo convert(){
        return this.body.get(0).convert();
    }
    @Setter
    @Getter
    public static class Body {
        private String videoUrl;
        private int videoId;
        private String regdate;
        private String modeName;
        private int mode;
        private String image;
        private Float distance;
        private int clubNo;
        private String clubName;
        private int ballType;

        public AcademyNasmo convert(){
            return AcademyNasmo.builder()
                .videoUrl(this.videoUrl)
                .videoId(this.videoId)
                .regdate(this.regdate)
                .modeName(this.modeName)
                .mode(this.mode)
                .image(this.image)
                .distance(this.distance)
                .clubNo(this.clubNo)
                .clubName(this.clubName)
                .ballType(this.ballType)
                .build();
        }
    }
}

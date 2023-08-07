package com.example.feignstudy.nasmo.api.response;

import com.example.feignstudy.nasmo.domain.AcademyNasmo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class NasmoListApiResponse {

    private int statusCode;
    private List<Body> body;

    public List<AcademyNasmo> converts(){
        return this.body.stream().map(
                Body::convert
        ).collect(Collectors.toList());
    }
    public static class Body {
        private int viewType;
        private String videoUrl;
        private int videoId;
        private String storeMethod;
        private boolean shareFlag;
        private String regdate;
        private int nasmoId;
        private String modeName;
        private int mode;
        private String image;
        private int favoriteSeq;
        private int favoriteFlag;
        private Float distance;
        private int clubNo;
        private String clubName;
        private int ballType;

        public AcademyNasmo convert(){
            return AcademyNasmo.builder()
                .viewType(this.viewType)
                .videoUrl(this.videoUrl)
                .videoId(this.videoId)
                .storeMethod(this.storeMethod)
                .shareFlag(this.shareFlag)
                .regdate(this.regdate)
                .nasmoId(this.nasmoId)
                .modeName(this.modeName)
                .mode(this.mode)
                .image(this.image)
                .favoriteSeq(this.favoriteSeq)
                .favoriteFlag(this.favoriteFlag)
                .distance(this.distance)
                .clubNo(this.clubNo)
                .clubName(this.clubName)
                .ballType(this.ballType)
                .build();

        }
    }
}

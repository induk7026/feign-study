package com.example.feignstudy.nasmo.api.response;

import com.example.feignstudy.nasmo.domain.AcademyNasmo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class SideNasmoResponse {

    private int statusCode;
    private List<SideNasmo> body;

    public AcademyNasmo convert(){
        return this.body.stream().findFirst().get().convert();
    }
    public static class SideNasmo {

        @JsonProperty("view_type")
        private int viewType;
        @JsonProperty("usr_no")
        private int usrNo;
        @JsonProperty("swing_path")
        private int swingPath;
        @JsonProperty("store_method_code")
        private int storeMethodCode;
        @JsonProperty("side_nasmo")
        private int sideNasmo;
        @JsonProperty("regdate")
        private String regdate;
        @JsonProperty("nasmo_id")
        private int nasmoId;
        @JsonProperty("mov_no")
        private int movNo;
        @JsonProperty("mode_code")
        private int modeCode;
        @JsonProperty("genic_gubun")
        private int genicGubun;
        @JsonProperty("game_gubun")
        private String gameGubun;
        @JsonProperty("file_store_code")
        private int fileStoreCode;
        @JsonProperty("file_nm")
        private String fileNm;
        @JsonProperty("face_angle")
        private Float faceAngle;
        @JsonProperty("distance")
        private Float distance;
        @JsonProperty("club_no")
        private String clubNo;
        @JsonProperty("club_name")
        private String clubName;
        @JsonProperty("club_group_code")
        private int clubGroupCode;
        @JsonProperty("club_code")
        private int clubCode;
        @JsonProperty("bvideo_id")
        private int videoId;
        @JsonProperty("bimg_nm")
        private String bimgNm;
        @JsonProperty("bfile_nm")
        private String bfileNm;
        @JsonProperty("balltype")
        private int ballType;
        @JsonProperty("ball_speed")
        private Float ballSpeed;
        @JsonProperty("ball_angle")
        private Float ballAngle;
        @JsonProperty("ball")
        private String ball;

        public AcademyNasmo convert(){

            return AcademyNasmo.builder()
                .viewType(this.viewType)
                .usrNo(this.usrNo)
                .regdate(this.regdate)
                .nasmoId(this.nasmoId)
                .videoId(this.movNo)
                .videoUrl(this.fileNm)
                .faceAngle(this.faceAngle)
                .distance(this.distance)
                .clubName(this.clubName)
                .clubNo(this.clubCode)
                .videoId(this.videoId)
                .sideImage(this.bimgNm)
                .ballType(this.ballType)
                .ballSpeed(this.ballSpeed)
                .ballAngle(this.ballAngle)
                .build();
        }
    }
}

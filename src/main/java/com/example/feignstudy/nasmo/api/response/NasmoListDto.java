package com.example.feignstudy.nasmo.api.response;

import com.example.feignstudy.nasmo.domain.Nasmo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NasmoListDto {

    private Integer usrNo;
    private Integer nasmoId;
    private String registerDt;
    private int ballDirectionCode;
    private int clubCode;
    private String clubName;
    private int clubGroupCode;
    private int modeCode;
    private int nasmoType;
    private int storeMethodCode;
    private float distance;
    private Integer videoId;
    private int fileExtension;
    private String nasmoFileSrc;
    private String nasmoThumbImgSrc;
    private Float ballAngle;
    private Float ballSpeed;
    private Float faceAngle;
    private Float swingPath;
    private String modeName;

    public Integer getUsrNo() {
        return usrNo;
    }

    public void setUsrNo(Integer usrNo) {
        this.usrNo = usrNo;
    }

    public Integer getNasmoId() {
        return nasmoId;
    }

    public void setNasmoId(Integer nasmoId) {
        this.nasmoId = nasmoId;
    }

    public String getRegisterDt() {
        return registerDt;
    }

    public void setRegisterDt(String registerDt) {
        this.registerDt = registerDt;
    }

    public int getBallDirectionCode() {
        return ballDirectionCode;
    }

    public void setBallDirectionCode(int ballDirectionCode) {
        this.ballDirectionCode = ballDirectionCode;
    }

    public int getClubCode() {
        return clubCode;
    }

    public void setClubCode(int clubCode) {
        this.clubCode = clubCode;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public int getClubGroupCode() {
        return clubGroupCode;
    }

    public void setClubGroupCode(int clubGroupCode) {
        this.clubGroupCode = clubGroupCode;
    }

    public int getModeCode() {
        return modeCode;
    }

    public void setModeCode(int modeCode) {
        this.modeCode = modeCode;
    }

    public int getNasmoType() {
        return nasmoType;
    }

    public void setNasmoType(int nasmoType) {
        this.nasmoType = nasmoType;
    }

    public int getStoreMethodCode() {
        return storeMethodCode;
    }

    public void setStoreMethodCode(int storeMethodCode) {
        this.storeMethodCode = storeMethodCode;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public int getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(int fileExtension) {
        this.fileExtension = fileExtension;
    }

    public String getNasmoFileSrc() {
        return nasmoFileSrc;
    }

    public void setNasmoFileSrc(String nasmoFileSrc) {
        this.nasmoFileSrc = nasmoFileSrc;
    }

    public String getNasmoThumbImgSrc() {
        return nasmoThumbImgSrc;
    }

    public void setNasmoThumbImgSrc(String nasmoThumbImgSrc) {
        this.nasmoThumbImgSrc = nasmoThumbImgSrc;
    }

    public Float getBallAngle() {
        return ballAngle;
    }

    public void setBallAngle(Float ballAngle) {
        this.ballAngle = ballAngle;
    }

    public Float getBallSpeed() {
        return ballSpeed;
    }

    public void setBallSpeed(Float ballSpeed) {
        this.ballSpeed = ballSpeed;
    }

    public Float getFaceAngle() {
        return faceAngle;
    }

    public void setFaceAngle(Float faceAngle) {
        this.faceAngle = faceAngle;
    }

    public Float getSwingPath() {
        return swingPath;
    }

    public void setSwingPath(Float swingPath) {
        this.swingPath = swingPath;
    }

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }


    public Nasmo convert(){

        return Nasmo
                .builder()
                .usrNo(this.getUsrNo())
                .nasmoId(this.getNasmoId())
                .build();
    }

}

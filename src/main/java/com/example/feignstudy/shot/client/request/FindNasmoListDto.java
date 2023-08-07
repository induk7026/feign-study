package com.example.feignstudy.shot.client.request;


import org.springframework.util.StringUtils;

import java.util.Calendar;

public class FindNasmoListDto {

    private String club;
    private String ballType;
    private String viewDate = "0";
    private String viewType = "0";
    private String rgnNo = "0";
    private String favoriteType = "0";
    private String storeCode = "0";
    private String viewYear;
    private String genicGubun = "general";

    public FindNasmoListRequest convert(int userNo, int pageNo, int rowPerPage){
        if(StringUtils.isEmpty(this.viewYear) && StringUtils.isEmpty(this.viewDate)){
            Calendar cal = Calendar.getInstance();
            viewYear = String.valueOf(cal.get(Calendar.YEAR));
        }

        return FindNasmoListRequest.Builder.builder()
                .userNo(userNo)
                .curPageNo(pageNo)
                .rowPerPage(rowPerPage)
                .club(this.club)
                .ballType(this.ballType)
                .viewDate(Integer.parseInt(this.viewDate))
                .viewType(Integer.parseInt(this.viewType))
                .rgnNo(Integer.parseInt(this.rgnNo))
                .favoriteType(Integer.parseInt(this.favoriteType))
                .storeCode(Integer.parseInt(this.storeCode))
                .viewYear(viewYear)
                .genicType(this.genicGubun)
                .schDate("")
                .dgMode("")
                .build();
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getBallType() {
        return ballType;
    }

    public void setBallType(String ballType) {
        this.ballType = ballType;
    }

    public String getViewDate() {
        return viewDate;
    }

    public void setViewDate(String viewDate) {
        this.viewDate = viewDate;
    }

    public String getViewType() {
        return viewType;
    }

    public void setViewType(String viewType) {
        this.viewType = viewType;
    }

    public String getRgnNo() {
        return rgnNo;
    }

    public void setRgnNo(String rgnNo) {
        this.rgnNo = rgnNo;
    }

    public String getFavoriteType() {
        return favoriteType;
    }

    public void setFavoriteType(String favoriteType) {
        this.favoriteType = favoriteType;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getViewYear() {
        return viewYear;
    }

    public void setViewYear(String viewYear) {
        this.viewYear = viewYear;
    }

    public String getGenicGubun() {
        return genicGubun;
    }

    public void setGenicGubun(String genicGubun) {
        this.genicGubun = genicGubun;
    }
}

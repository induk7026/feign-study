package com.example.feignstudy.shot.client.request;

public class FindNasmoListRequest {

    private int nasmoId;
    private int nasmoType;
    private int storeCode;
    private int favoriteType;
    private int rgnNo;
    private int viewType;
    private String schDate;
    private String dgMode;
    private String genic_type;
    private String viewYear;
    private int viewDate;
    private String ballType;
    private String club;
    private int rowPerPage;
    private int curPageNo;
    private int userNo;


    public FindNasmoListRequest() {}

    public FindNasmoListRequest(int nasmoId, int nasmoType, int storeCode, int favoriteType, int rgnNo, int viewType, String schDate, String dgMode, String genicType, String viewYear, int viewDate, String ballType, String club, int rowPerPage, int curPageNo, int userNo) {
        this.nasmoId = nasmoId;
        this.nasmoType = nasmoType;
        this.storeCode = storeCode;
        this.favoriteType = favoriteType;
        this.rgnNo = rgnNo;
        this.viewType = viewType;
        this.schDate = schDate;
        this.dgMode = dgMode;
        this.genic_type = genicType;
        this.viewYear = viewYear;
        this.viewDate = viewDate;
        this.ballType = ballType;
        this.club = club;
        this.rowPerPage = rowPerPage;
        this.curPageNo = curPageNo;
        this.userNo = userNo;
    }

    public int getNasmoId() {
        return nasmoId;
    }

    public int getNasmoType() {
        return nasmoType;
    }

    public int getStoreCode() {
        return storeCode;
    }

    public int getFavoriteType() {
        return favoriteType;
    }

    public int getRgnNo() {
        return rgnNo;
    }

    public int getViewType() {
        return viewType;
    }

    public String getSchDate() {
        return schDate;
    }

    public String getDgMode() {
        return dgMode;
    }

    public String getGenic_type() {
        return genic_type;
    }

    public String getViewYear() {
        return viewYear;
    }

    public int getViewDate() {
        return viewDate;
    }

    public String getBallType() {
        return ballType;
    }

    public String getClub() {
        return club;
    }

    public int getRowPerPage() {
        return rowPerPage;
    }

    public int getCurPageNo() {
        return curPageNo;
    }

    public int getUserNo() {
        return userNo;
    }


    public static final class Builder {
        private int nasmoId;
        private int nasmoType;
        private int storeCode;
        private int favoriteType;
        private int rgnNo;
        private int viewType;
        private String schDate;
        private String dgMode;
        private String genicType;
        private String viewYear;
        private int viewDate;
        private String ballType;
        private String club;
        private int rowPerPage;
        private int curPageNo;
        private int userNo;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder nasmoId(int nasmoId) {
            this.nasmoId = nasmoId;
            return this;
        }

        public Builder nasmoType(int nasmoType) {
            this.nasmoType = nasmoType;
            return this;
        }

        public Builder storeCode(int storeCode) {
            this.storeCode = storeCode;
            return this;
        }

        public Builder favoriteType(int favoriteType) {
            this.favoriteType = favoriteType;
            return this;
        }

        public Builder rgnNo(int rgnNo) {
            this.rgnNo = rgnNo;
            return this;
        }

        public Builder viewType(int viewType) {
            this.viewType = viewType;
            return this;
        }

        public Builder schDate(String schDate) {
            this.schDate = schDate;
            return this;
        }

        public Builder dgMode(String dgMode) {
            this.dgMode = dgMode;
            return this;
        }

        public Builder genicType(String genicType) {
            this.genicType = genicType;
            return this;
        }

        public Builder viewYear(String viewYear) {
            this.viewYear = viewYear;
            return this;
        }

        public Builder viewDate(int viewDate) {
            this.viewDate = viewDate;
            return this;
        }

        public Builder ballType(String ballType) {
            this.ballType = ballType;
            return this;
        }

        public Builder club(String club) {
            this.club = club;
            return this;
        }

        public Builder rowPerPage(int rowPerPage) {
            this.rowPerPage = rowPerPage;
            return this;
        }

        public Builder curPageNo(int curPageNo) {
            this.curPageNo = curPageNo;
            return this;
        }

        public Builder userNo(int userNo) {
            this.userNo = userNo;
            return this;
        }

        public FindNasmoListRequest build() {
            return new FindNasmoListRequest(nasmoId, nasmoType, storeCode, favoriteType, rgnNo, viewType, schDate, dgMode, genicType, viewYear, viewDate, ballType, club, rowPerPage, curPageNo, userNo);
        }
    }

    @Override
    public String toString() {
        return "{" +
                "nasmoId=" + nasmoId +
                ", nasmoType=" + nasmoType +
                ", storeCode=" + storeCode +
                ", favoriteType=" + favoriteType +
                ", rgnNo=" + rgnNo +
                ", viewType=" + viewType +
                ", schDate='" + schDate + '\'' +
                ", dgMode='" + dgMode + '\'' +
                ", genicType='" + genic_type + '\'' +
                ", viewYear='" + viewYear + '\'' +
                ", viewDate=" + viewDate +
                ", ballType='" + ballType + '\'' +
                ", club='" + club + '\'' +
                ", rowPerPage=" + rowPerPage +
                ", curPageNo=" + curPageNo +
                ", userNo=" + userNo +
                '}';
    }
}

package com.example.feignstudy.nasmo.api.request;

public class FindUserNoAndDateRequest {
    private Integer userNo;
    private String searchYearMonth;

    public static FindUserNoAndDateRequest of(Integer usrNo, String searchYearMonth) {
        return new FindUserNoAndDateRequest(usrNo, searchYearMonth);
    }

    public FindUserNoAndDateRequest() {}

    public FindUserNoAndDateRequest(Integer usrNo, String searchYearMonth) {
        this.userNo = usrNo;
        this.searchYearMonth = searchYearMonth;
    }

    public Integer getUserNo() {
        return userNo;
    }
    public Integer getUsrNo() {
        return userNo;
    }



    public String getSearchYearMonth() {
        return searchYearMonth;
    }
}

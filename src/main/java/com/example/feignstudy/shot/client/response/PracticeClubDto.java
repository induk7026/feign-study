package com.example.feignstudy.shot.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PracticeClubDto {

    private int statusCode;
    private List<EliteDriving> body;

    @Getter
    @Setter
    public static class EliteDriving{
        private int clubNo;
        private String club;
        private Float distance;
        private String isRequestDate;
    }

}

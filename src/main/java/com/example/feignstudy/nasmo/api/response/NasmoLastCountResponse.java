package com.example.feignstudy.nasmo.api.response;

import com.example.feignstudy.nasmo.domain.AcademyNasmo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class NasmoLastCountResponse {

    private int statusCode;
    private List<LastCount> body;

    public AcademyNasmo convert(){
        return this.body.get(0).convert();
    }
    @Getter
    @Setter
    public static class LastCount {
        private int cnt;
        private String date;

        public AcademyNasmo convert(){
            return AcademyNasmo.builder()
                .count(cnt)
                .date(date)
                .build();
        }
    }
}

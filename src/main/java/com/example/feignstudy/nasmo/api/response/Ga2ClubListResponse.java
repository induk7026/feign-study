package com.example.feignstudy.nasmo.api.response;

import com.example.feignstudy.nasmo.domain.Driving;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ga2ClubListResponse {



    private int statusCode;
    private List<Ga2ClubDto> body;

    public List<Driving> converts(){
        return this.body.stream()
                .map(Ga2ClubDto::convert)
                .collect(Collectors.toList());
    }
    @Getter
    @Setter
    public static class Ga2ClubDto {
        private Long totalShotCnt;
        @JsonProperty("order_code")
        private int orderCode;
        private Long niceShotCnt;
        private String nasmoYn;
        private Long excellentShotCnt;
        private Long distance;
        private Long clubNo;

        private int clubGroupCode;
        private String club;

        public Driving convert(){
            return Driving.builder()
                    .totalShotCnt(this.totalShotCnt)
//                    .orderCode(this.orderCode)
                    .niceShotCnt(this.niceShotCnt)
                    .nasmoYn(this.nasmoYn)
                    .excellentShotCnt(this.excellentShotCnt)
                    .distance(this.distance)
                    .clubNo(this.clubNo)
                    .clubGroupCode(this.clubGroupCode)
                    .club(this.club)
                    .build();
        }
    }
}

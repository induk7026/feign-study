package com.example.feignstudy.nasmo.api.response;

import com.example.feignstudy.nasmo.domain.Driving;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ga2FieldPracticeClubListResponse {

    private List<Ga2FieldPracticeClubDto> body;
    private int statusCode;

    public List<Driving> converts() {
        return this.body.stream()
            .map(Ga2FieldPracticeClubDto::convert)
            .collect(Collectors.toList());
    }

    @Getter
    @Setter
    public static class Ga2FieldPracticeClubDto {
        private String nasmoYn;
        private Long distance;
        private Long clubNo;

        public Driving convert() {
            return Driving.builder()
                .nasmoYn(this.nasmoYn)
                .distance(this.distance)
                .clubNo(this.clubNo)
                .build();
        }
    }


}

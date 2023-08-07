package com.example.feignstudy.shot.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldClubAvgDto {


    public List<FieldClubAvg> body;
    public int statusCode;

    @Getter
    @Setter
    public static class FieldClubAvg {
        public Float headSpeed;
        public Float distance;
        public Float carry;
        public Float ballSpeed;
        public Float angle;
    }
}

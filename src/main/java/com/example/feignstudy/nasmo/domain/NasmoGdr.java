package com.example.feignstudy.nasmo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class NasmoGdr {

    private int ballDirectionCode;
    private int clubCode;
    private int modeCode;
    private int nasmoType;
    private int storeMethodCode;
    private Float distance;

    private List<ClubCode> cc;
}

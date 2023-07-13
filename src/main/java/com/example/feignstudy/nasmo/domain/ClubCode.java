package com.example.feignstudy.nasmo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClubCode {
    private String clubName;
    private int clubGroupCode;
}

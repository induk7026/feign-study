package com.example.feignstudy.nasmo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Nasmo {

    private int usrNo;
    private int nasmoId;
    private String registerDt;
    private List<NasmoGdr> ng;
}

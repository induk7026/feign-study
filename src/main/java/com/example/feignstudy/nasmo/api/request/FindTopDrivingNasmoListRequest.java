package com.example.feignstudy.nasmo.api.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FindTopDrivingNasmoListRequest {

    private int usrNo;
    private int nasmoId;
    private int club;
    private int size;
}

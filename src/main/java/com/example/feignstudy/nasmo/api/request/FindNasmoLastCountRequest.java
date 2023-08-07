package com.example.feignstudy.nasmo.api.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FindNasmoLastCountRequest {


    private int usrNo;
    private String date;

}

package com.example.feignstudy.nasmo.api.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FindViewByClubAndDateRequest {


    private int usrNo;
    private int clubNo;
    private String date;

}

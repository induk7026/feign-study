package com.example.feignstudy.nasmo.api.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FindNasmoRequest {

    private int userNo;
    private int movieId;

}

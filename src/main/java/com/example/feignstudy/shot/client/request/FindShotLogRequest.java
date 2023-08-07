package com.example.feignstudy.shot.client.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FindShotLogRequest {

    private String date;
    private String usrnoStr;
}

package com.example.feignstudy.shot.client.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FindUserNoAndDateRequest {

    private Integer userNo;
    private String date;

    public Integer getUsrNo() {
        return userNo;
    }
}

package com.example.feignstudy.shot.client.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FindClubShotDataRequest {

    private Integer userNo;
    private String date;
    private int club;

    public Integer getUsrNo() {
        return userNo;
    }
}

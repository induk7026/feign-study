package com.example.feignstudy.shot.client.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FindDrivingShotDataRequest {

    private int userNo;
    private String date;
    private int clubNo;
    private int size;
    private int tsCode;

    public Integer getUsrNo() {
        return userNo;
    }
}

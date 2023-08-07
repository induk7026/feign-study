package com.example.feignstudy.shot.client.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FindTotalClubCount {

    private int usrNo;
    private int modeId;
    private String date;
}

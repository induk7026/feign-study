package com.example.feignstudy.shot.client.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FindEliteClubListRequest {

    private int usrNo;
    private int size;
    private String club;
}

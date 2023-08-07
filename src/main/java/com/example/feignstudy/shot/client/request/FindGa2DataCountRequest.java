package com.example.feignstudy.shot.client.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FindGa2DataCountRequest {

    private int usrNo;
    private String searchDate;
    private int shotOrder;
}

package com.example.feignstudy.shot.client.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FindGa2DataRequest {

    private int size;
    private int page;
    private int shotOrder;
    private String searchDate;
    private int usrNo;
}

package com.example.feignstudy.shot.client.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FindGa2DataListRequest {

    private int usrNo;
    private String date;
    private int modeId;
    private int clubNo;
    private int page;
    private int size;
}

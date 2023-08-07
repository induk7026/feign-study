package com.example.feignstudy.nasmo.api.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FindGa2FieldPracticeClubListRequest {


    private int usrNo;
    private int modeId;
    private String date;

}

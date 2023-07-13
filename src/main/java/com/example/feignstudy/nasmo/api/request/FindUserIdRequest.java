package com.example.feignstudy.nasmo.api.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class FindUserIdRequest {
    private int userNo;
    private int nasmoId;

}

package com.example.feignstudy.nasmo.api.request;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class FindIdRequest {
    private int value;
}

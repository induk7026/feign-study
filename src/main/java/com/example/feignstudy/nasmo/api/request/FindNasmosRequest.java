package com.example.feignstudy.nasmo.api.request;


import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class FindNasmosRequest {

    private int nasmoType;
    private int videoId;
    private int userNo;
    private int size;

    public static FindNasmosRequest of(Integer size, Integer userNo, Integer videoId) {
        return new FindNasmosRequest(
                0,
                videoId,
                userNo,
                size
        );
    }
}

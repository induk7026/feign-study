package com.example.feignstudy.nasmo.api.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Map;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FindSideNasmoRequest {

    public static FindSideNasmoRequest of(Map<String, Object> searchMap) {
        return new FindSideNasmoRequest(
                (Integer) searchMap.get("nasmoId"),
                (Integer) searchMap.get("movieId")
        );
    }

    private int nasmoId;
    private int movieId;

}

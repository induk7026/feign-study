package com.example.feignstudy.nasmo.api.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Map;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class FindFavoriteContentsListRequest {

    private int size;
    private int favoriteType;
    private int userNo;
    private int favoriteSeq;

    public static FindFavoriteContentsListRequest of(Map<String, Integer> search) {
        return new FindFavoriteContentsListRequest(
            search.get("size"),
            search.get("favoriteType"),
            search.get("userNo"),
            search.get("favoriteSeq")
        );
    }
}

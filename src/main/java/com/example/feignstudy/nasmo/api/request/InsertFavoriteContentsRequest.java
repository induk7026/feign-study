package com.example.feignstudy.nasmo.api.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Map;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class InsertFavoriteContentsRequest {

    private int nasmoId;
    private int userNo;
    private int saveMedia;
    private int favoriteType;
    private String thumbnail;
    private String title;
    private String message;

    public static InsertFavoriteContentsRequest of(Map<String, Object> entity) {
        return new InsertFavoriteContentsRequest(
                (Integer) entity.get("content_id"),
                (Integer) entity.get("user_no"),
            3,
                (Integer) entity.get("favorite_type"),
                entity.get("thumbnail").toString(),
                entity.get("title").toString(),
                entity.get("message").toString()
        );
    }
}

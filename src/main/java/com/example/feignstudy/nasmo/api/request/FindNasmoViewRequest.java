package com.example.feignstudy.nasmo.api.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FindNasmoViewRequest {
    private int videoId;

    public int get_video_id() {
        return videoId;
    }
}

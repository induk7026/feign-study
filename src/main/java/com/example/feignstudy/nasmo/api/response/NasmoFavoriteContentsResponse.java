package com.example.feignstudy.nasmo.api.response;

import com.example.feignstudy.nasmo.domain.FavoriteContents;
import com.example.feignstudy.util.DateUtil;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class NasmoFavoriteContentsResponse {


    private List<FavoriteContentsDto> body;
    private int statusCode;

    public List<FavoriteContents> converts(){
        return this.body.stream().map(
                FavoriteContentsDto::convert
        ).collect(Collectors.toList());
    }

    @Getter
    @Setter
    public static class FavoriteContentsDto {
        private int viewType;
        private int videoId;
        private int userNo;
        private String title;
        private String thumbnail;
        private int saveMedia;
        private int rownum;
        private String regdate;
        private int nasmoType;
        private String message;
        private String fileName;
        private int favoriteType;
        private int favoriteSeq;
        private int contentId;

        public FavoriteContents convert(){
            return FavoriteContents.builder()
                    .viewType(this.viewType)
                    .videoId(this.videoId)
                    .userNo(this.userNo)
                    .title(this.title)
                    .thumbnail(this.thumbnail)
                    .saveMedia(this.saveMedia)
                    .rownum(this.rownum)
                    .regdate(DateUtil.defaltParseAsDate(this.regdate))
                    .nasmoType(this.nasmoType)
                    .message(this.message)
                    .fileName(this.fileName)
                    .favoriteType(this.favoriteType)
                    .favoriteSeq(this.favoriteSeq)
                    .contentId(this.contentId)
                    .build();
        }
    }
}

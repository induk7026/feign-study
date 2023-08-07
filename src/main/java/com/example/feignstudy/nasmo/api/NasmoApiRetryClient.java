package com.example.feignstudy.nasmo.api;

import com.example.feignstudy.config.FeignRetry;
import com.example.feignstudy.nasmo.api.request.*;
import com.example.feignstudy.nasmo.api.response.*;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "nasmoApiClient", url = "https://0l6lglqx6b.execute-api.ap-northeast-2.amazonaws.com/qa/gdr/nasmo", configuration = {FeignRetry.class})
public interface NasmoApiRetryClient {

    @PostMapping("/login")
    @Headers({"Content-Type: application/json"})
    UserLoginResponse getUserNasmoById(@RequestBody LoginRequest loginRequest);

    @PostMapping("/driving-list")
    @Headers({"Content-Type: application/json"})
    TopDrivingNasmoListResponse getTopDrivingNasmoList(@RequestBody FindTopDrivingNasmoListRequest request);

    @PostMapping("/driving-shot")
    @Headers({"Content-Type: application/json"})
    TopDrivingNasmoShotResponse getTopDrivingNasmoShot(@RequestBody FindTopDrivingNasmoShotRequest request);


    @PostMapping("/list")
    @Headers({"Content-Type: application/json"})
    TopDrivingNasmoListResponse selectNasmoList(@RequestBody FindNasmoListRequest request);

    @PostMapping("/view")
    @Headers({"Content-Type: application/json"})
    NasmoVideoViewResponse selectView(@RequestBody FindNasmoViewRequest request);

    @PostMapping("/last-count")
    @Headers({"Content-Type: application/json"})
    NasmoLastCountResponse selectLastCount(@RequestBody FindNasmoLastCountRequest request);

    @PostMapping("/view-by-club-date")
    @Headers({"Content-Type: application/json"})
    NasmoViewResponse selectViewByClubAndDate(@RequestBody FindViewByClubAndDateRequest request);

    @PostMapping("/field-club-list")
    @Headers({"Content-Type: application/json"})
    Ga2FieldPracticeClubListResponse selectGa2FieldPracticeClubList(@RequestBody FindGa2FieldPracticeClubListRequest request);

    @PostMapping("/club-list")
    @Headers({"Content-Type: application/json"})
    Ga2ClubListResponse selectGa2ClubList(@RequestBody FindGa2FieldPracticeClubListRequest request);

    // grp_select_GAsideNasmoDetail4mobile 프로시저
    @PostMapping("/ga/side-detail-mobile")
    @Headers({"Content-Type: application/json"})
    SideNasmoResponse selectSideNasmo(@RequestBody FindSideNasmoRequest request);


    // use_gamobile_select_nasmodetail 프로시저
    @PostMapping("/ga/mobile-detail")
    @Headers({"Content-Type: application/json"})
    NasmoApiResponse selectNasmo(@RequestBody FindNasmoRequest request);

    // use_gamobile_select_sharenasmo 프로시저
    @PostMapping("/ga/mobile-share")
    @Headers({"Content-Type: application/json"})
    NasmoApiResponse selectShareNasmo(@RequestBody FindTopDrivingNasmoShotSnakeCaseRequest request);


    // use_gamobile_select_sharenasmodetail 프로시저
    @PostMapping("/ga/mobile-share-detail")
    @Headers({"Content-Type: application/json"})
    NasmoApiResponse selectShareNasmoDetail(@RequestBody FindNasmoViewSnakeRequest request);

    // usp_ga_delete_favoritecontents_by_videoid 프로시저
    @PostMapping("/ga/delete-favorite-by-video-id")
    @Headers({"Content-Type: application/json"})
    DeleteNasmoResponse deleteFavoriteByVideoId(@RequestBody UserNoAndVideoIdRequest request);

    // usp_ga_delete_nasmo 프로시저
    @PostMapping("/ga/delete")
    @Headers({"Content-Type: application/json"})
    DeleteNasmoResponse deleteNasmoByMoveNo(@RequestBody UserNoAndVideoIdRequest request);


    // usp_gamobile_select_favoritecontents_list 프로시저
    @PostMapping("/mobile/favorite-list")
    @Headers({"Content-Type: application/json"})
    NasmoFavoriteContentsResponse selectFavoriteContentsList(@RequestBody FindFavoriteContentsListRequest request);

    // usp_gamobile_update_nasmo_shareflag 프로시저
    @PostMapping("/mobile/update-share-flag")
    @Headers({"Content-Type: application/json"})
    UpdateShareFlagResponse updateShareFlag(@RequestBody UserNoAndVideoIdRequest request);


    // usp_insert_favorite_contents
    @PostMapping("/favorite-contents")
    @Headers({"Content-Type: application/json"})
    UpdateShareFlagResponse insertFavoriteContents(@RequestBody InsertFavoriteContentsRequest request);

    // use_gamobile_select_nasmolist
    @PostMapping("/ga/mobile/list")
    @Headers({"Content-Type: application/json"})
    NasmoListApiResponse selectNasmoList(@RequestBody FindNasmosRequest request);

    // usp_ga_delete_favoritecontents 프로시저
    @PostMapping("/ga/mobile/favorite")
    @Headers({"Content-Type: application/json"})
    DeleteNasmoResponse deleteFavoriteBySeq(@RequestBody UserNoAndFavoriteRequest request);
}

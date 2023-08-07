package com.example.feignstudy.shot.client;

import com.example.feignstudy.shot.client.request.*;
import com.example.feignstudy.shot.client.response.*;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "awsShotApiClient", url = "${external.url.shot}")
public interface AwsShotApiClient {

    @PostMapping("/practice/club-list")
    @Headers({"Content-Type: application/json"})
    PracticeClubDto selectPracticeClubList(@RequestBody FindUserNoAndDateRequest request);

    @PostMapping("/club-data")
    @Headers({"Content-Type: application/json"})
    ClubShotDataDto selectClubShotData(@RequestBody FindClubShotDataRequest request);

    @PostMapping("/driving-data")
    @Headers({"Content-Type: application/json"})
    DrivingShotDataDto getDrivingShotData(@RequestBody FindDrivingShotDataRequest request);

    @PostMapping("/practice/list")
    @Headers({"Content-Type: application/json"})
    TopDrivingPracticeDto getTopDrivingPracticeList(@RequestBody FindUserNoAndDateRequest request);

    @PostMapping("/practice/shot-location")
    @Headers({"Content-Type: application/json"})
    TopDrivingPracticeShotLocationDto getTopDrivingPracticeShotLocation(@RequestBody FindClubShotDataRequest request);

    @PostMapping("/data")
    @Headers({"Content-Type: application/json"})
    Ga2DataDto selectGa2Data(@RequestBody FindGaDataRequest request);


    @PostMapping("/data-count")
    @Headers({"Content-Type: application/json"})
    ShotApiCountDto selectGa2DataCount(@RequestBody FindGa2DataCountRequest request);

    @PostMapping("/data-list")
    @Headers({"Content-Type: application/json"})
    Ga2DataListDto selectGa2DataList(@RequestBody FindGa2DataListRequest request);

    @PostMapping("/practice/total-count")
    @Headers({"Content-Type: application/json"})
    ShotApiCountDto selectGa2TotalCount(@RequestBody FindGa2TotalCountRequest request);

    @PostMapping("/practice/total-club-count")
    @Headers({"Content-Type: application/json"})
    ShotApiCountDto selectGa2FieldPracticeTotalClubCount(@RequestBody FindTotalClubCount request);

    @PostMapping("/practice/avg")
    @Headers({"Content-Type: application/json"})
    FieldClubAvgDto selectGa2FieldPracticeAvgData(@RequestBody FindGa2TotalCountRequest request);

    @PostMapping("/elite-club-list")
    @Headers({"Content-Type: application/json"})
    EliteClubListDto uspEliteSelectClubDataList(@RequestBody FindEliteClubListRequest request);

    @PostMapping("/ga/shot-log")
    @Headers({"Content-Type: application/json"})
    ShotLogDto findShotLog(@RequestBody FindShotLogRequest request);

}

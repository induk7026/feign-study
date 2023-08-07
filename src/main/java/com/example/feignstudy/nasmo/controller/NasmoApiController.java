package com.example.feignstudy.nasmo.controller;

import com.example.feignstudy.nasmo.api.request.*;
import com.example.feignstudy.nasmo.api.response.UserLoginResponse;
import com.example.feignstudy.nasmo.domain.AcademyNasmo;
import com.example.feignstudy.nasmo.domain.Driving;
import com.example.feignstudy.nasmo.domain.Nasmo;
import com.example.feignstudy.nasmo.domain.TopDrivingNasmo;
import com.example.feignstudy.nasmo.service.NasmoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class NasmoApiController {

    private final NasmoService nasmoService;

//    @GetMapping("/id")
//    public Nasmo getId(){
//        return nasmoService.getNasmoId(123456);
//    }
//
//    @GetMapping("/user_id")
//    public Nasmo getUserId(){
//        return nasmoService.getUserId();
//    }

    @GetMapping("/retry_user_id")
    public UserLoginResponse getRetryUserId(){
        return nasmoService.retryUserId();
    }


    @GetMapping("/test")
    public Nasmo test() throws IOException {
        return nasmoService.test();
    }

    @PostMapping("/driving-list")
    public List<TopDrivingNasmo> getTopDrivingNasmoList(@RequestBody FindTopDrivingNasmoListRequest request) {
        return nasmoService.getTopDrivingNasmoList(request);
    }

    @PostMapping("/driving-shot")
    public TopDrivingNasmo getTopDrivingNasmoShot(@RequestBody FindTopDrivingNasmoShotRequest request) {
        return nasmoService.getTopDrivingNasmoShot(request);
    }

    @PostMapping("/list")
    public List<AcademyNasmo> selectNasmoList(@RequestBody FindNasmoListRequest request) {
        return nasmoService.selectNasmoList(request);
    }

    @PostMapping("/view")
    public AcademyNasmo selectView(@RequestBody FindNasmoViewRequest request) {
        return nasmoService.selectView(request);
    }

    @PostMapping("/last-count")
    public AcademyNasmo selectView(@RequestBody FindNasmoLastCountRequest request) {
        return nasmoService.selectLastCount(request);
    }

    @PostMapping("/view-by-club-date")
    public AcademyNasmo selectViewByClubAndDate(@RequestBody FindViewByClubAndDateRequest request) {
        return nasmoService.selectViewByClubAndDate(request);
    }

    @PostMapping("/field-club-list")
    public List<Driving> selectGa2FieldPracticeClubList(@RequestBody FindGa2FieldPracticeClubListRequest request) {
        return nasmoService.selectGa2FieldPracticeClubList(request);
    }

    @PostMapping("/club-list")
    public List<Driving> selectGa2ClubList(@RequestBody FindGa2FieldPracticeClubListRequest request) {
        return nasmoService.selectGa2ClubList(request);
    }

    @PostMapping("/ga/mobile-detail")
    public AcademyNasmo selectNasmo(@RequestBody FindNasmoRequest request) {
        return nasmoService.selectNasmo(request);
    }

    @PostMapping("/ga/side-detail-mobile")
    public AcademyNasmo selectSideNasmo(@RequestBody FindSideNasmoRequest request) {
        return nasmoService.selectSideNasmo(request);
    }

    @PostMapping("/ga/mobile-share")
    public AcademyNasmo selectShareNasmo(@RequestBody FindTopDrivingNasmoShotSnakeCaseRequest request) {
        return nasmoService.selectShareNasmo(request);
    }

    @PostMapping("/ga/mobile-share-detail")
    public AcademyNasmo selectShareNasmoDetail(@RequestBody FindNasmoViewSnakeRequest request) {
        return nasmoService.selectShareNasmoDetail(request);
    }
}

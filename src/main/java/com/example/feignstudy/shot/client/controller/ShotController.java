package com.example.feignstudy.shot.client.controller;

import com.example.feignstudy.shot.client.request.FindNasmoListDto;
import com.example.feignstudy.shot.client.request.FindNasmoListRequest;
import com.example.feignstudy.shot.client.response.*;
import com.example.feignstudy.shot.client.service.ShotService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/shot")
@RestController
@RequiredArgsConstructor
public class ShotController {

    private final ShotService shotService;


    @GetMapping("/getDrivingShotData")
    public List<DrivingShotDataDto.DrivingShotData> getDrivingShotData(){
        return shotService.getDrivingShotData();
    }

    @GetMapping("/selectPracticeClubList")
    public List<PracticeClubDto.EliteDriving> selectPracticeClubList(){
        return shotService.selectPracticeClubList();
    }

    @GetMapping("/selectClubShotData")
    public List<ClubShotDataDto.ClubShotData> selectClubShotData(){
        return shotService.selectClubShotData();
    }

    @GetMapping("/getTopDrivingPracticeList")
    public List<TopDrivingPracticeDto.TopDrivingPractice> getTopDrivingPracticeList(){
        return shotService.getTopDrivingPracticeList();
    }

    @GetMapping("/getTopDrivingPracticeShotLocation")
    public List<TopDrivingPracticeShotLocationDto.TopDrivingPracticeShotLocation> getTopDrivingPracticeShotLocation(){
        return shotService.getTopDrivingPracticeShotLocation();
    }

    @GetMapping("/ga2DataDto")
    public List<Ga2DataDto.Ga2Data> Ga2DataDto(){
        return shotService.getGa2DataDto();
    }

    @GetMapping("/ga2DataCountDto")
    public Long Ga2DataCount(){
        return shotService.getGa2DataCountDto();
    }

    @GetMapping("/selectGa2DataList")
    public List<Ga2DataListDto.Ga2DataList> selectGa2DataList(){
        return shotService.selectGa2DataList();
    }

    @GetMapping("/selectGa2TotalCount")
    public Long selectGa2TotalCount(){
        return shotService.selectGa2TotalCount();
    }

    @GetMapping("/selectGa2FieldPracticeTotalClubCount")
    public Long selectGa2FieldPracticeTotalClubCount(){
        return shotService.selectGa2FieldPracticeTotalClubCount();
    }

    @GetMapping("/selectGa2FieldPracticeAvgData")
    public List<FieldClubAvgDto.FieldClubAvg> selectGa2FieldPracticeAvgData(){
        return shotService.selectGa2FieldPracticeAvgData();
    }

    @GetMapping("/findShotLog")
    public List<ShotLogDto.ShotLog> findShotLog(){
        return shotService.findShotLog();
    }


    @GetMapping("/test")
    public List<ShotLogDto.ShotLog> test(@ModelAttribute FindNasmoListDto dto){


        FindNasmoListRequest request = dto.convert(1,1,1);
        return shotService.findShotLog();
    }



}

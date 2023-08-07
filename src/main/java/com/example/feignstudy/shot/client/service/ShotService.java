package com.example.feignstudy.shot.client.service;

import com.example.feignstudy.shot.client.AwsShotApiClient;
import com.example.feignstudy.shot.client.request.*;
import com.example.feignstudy.shot.client.response.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShotService {

    private final AwsShotApiClient awsShotApiClient;

    public List<DrivingShotDataDto.DrivingShotData> getDrivingShotData(){
        DrivingShotDataDto result = awsShotApiClient.getDrivingShotData(
                new FindDrivingShotDataRequest(943369, "2023-06-01", 11 ,4, 599999999)
        );
        return result.getBody();
    }

    public List<PracticeClubDto.EliteDriving> selectPracticeClubList(){
        PracticeClubDto result = awsShotApiClient.selectPracticeClubList(
                new FindUserNoAndDateRequest(943369, "2023-06-01")
        );
        return result.getBody();
    }

    public List<ClubShotDataDto.ClubShotData> selectClubShotData() {
        ClubShotDataDto result = awsShotApiClient.selectClubShotData(
                new FindClubShotDataRequest(943369, "2023-06-01", 11)
        );
        return result.getBody();
    }

    public List<TopDrivingPracticeDto.TopDrivingPractice> getTopDrivingPracticeList() {
        TopDrivingPracticeDto result = awsShotApiClient.getTopDrivingPracticeList(
                new FindUserNoAndDateRequest(943369, "2023-06-01")
        );
        return result.getBody();

    }

    public List<TopDrivingPracticeShotLocationDto.TopDrivingPracticeShotLocation> getTopDrivingPracticeShotLocation() {
        TopDrivingPracticeShotLocationDto result = awsShotApiClient.getTopDrivingPracticeShotLocation(
                new FindClubShotDataRequest(943369, "2023-06-01", 1)
        );
        return result.getBody();
    }
    public List<Ga2DataDto.Ga2Data> getGa2DataDto() {
        Ga2DataDto result = awsShotApiClient.selectGa2Data(
                new FindGaDataRequest(943369, "2023-06-17", 1, 1, 4)
        );
        return result.getBody();
    }

    public Long getGa2DataCountDto() {
        ShotApiCountDto result = awsShotApiClient.selectGa2DataCount(
                new FindGa2DataCountRequest(943369, "2023-06-17", 1)
        );
        return result.getBody().get(0).getCnt();
    }

    public List<Ga2DataListDto.Ga2DataList> selectGa2DataList() {
        Ga2DataListDto result = awsShotApiClient.selectGa2DataList(
                new FindGa2DataListRequest(943369, "2023-06-17", 10, 1,1, 4)
        );
        return result.getBody();
    }

    public Long selectGa2TotalCount() {
        ShotApiCountDto result = awsShotApiClient.selectGa2TotalCount(
                new FindGa2TotalCountRequest(943369, "2023-06-17", 1, 11)
        );
        return result.getBody().get(0).getCnt();
    }

    public Long selectGa2FieldPracticeTotalClubCount() {
        ShotApiCountDto result = awsShotApiClient.selectGa2FieldPracticeTotalClubCount(
                new FindTotalClubCount(943369, 1,"2023-06-17")
        );
        return result.getBody().get(0).getCnt();
    }

    public List<FieldClubAvgDto.FieldClubAvg> selectGa2FieldPracticeAvgData() {
        FieldClubAvgDto result = awsShotApiClient.selectGa2FieldPracticeAvgData(
                new FindGa2TotalCountRequest(943369, "2023-06-17",1, 10)
        );
        return result.getBody();
    }

    public List<EliteClubListDto.EliteClub> uspEliteSelectClubDataList() {
        EliteClubListDto result = awsShotApiClient.uspEliteSelectClubDataList(
                new FindEliteClubListRequest(943369,1, "test")
        );
        return result.getBody();
    }

    public List<ShotLogDto.ShotLog> findShotLog() {
        ShotLogDto result = awsShotApiClient.findShotLog(
                new FindShotLogRequest("dddd", "943369, 123456")
        );
        return result.getBody();
    }
}

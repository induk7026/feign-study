package com.example.feignstudy.nasmo.service;

import com.example.feignstudy.nasmo.api.NasmoApiClient;
import com.example.feignstudy.nasmo.api.NasmoApiRetryClient;
import com.example.feignstudy.nasmo.api.request.*;
import com.example.feignstudy.nasmo.api.response.*;
import com.example.feignstudy.nasmo.domain.AcademyNasmo;
import com.example.feignstudy.nasmo.domain.Driving;
import com.example.feignstudy.nasmo.domain.Nasmo;
import com.example.feignstudy.nasmo.domain.TopDrivingNasmo;
import com.example.feignstudy.util.JacksonUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class NasmoService {
    private final NasmoApiRetryClient nasmoApiRetryClient;

    public UserLoginResponse retryUserId(){
        UserLoginResponse nasmoApiResponse = nasmoApiRetryClient.getUserNasmoById(
            new LoginRequest("2222@email.com","pw")
        );
        return nasmoApiResponse;
    }

    public Nasmo test() throws IOException {

        String uri = "/lesson-log-last";

        FindUserNoAndDateRequest request = FindUserNoAndDateRequest.of(943369, "2018-05");
        HttpPost httpPost = NasmoApiClient.postClient(uri, request);
        CloseableHttpClient client = HttpClients.createDefault();

        try {
            CloseableHttpResponse execute = client.execute(httpPost);
            String result = EntityUtils.toString(execute.getEntity());
            FindNasmoApiDto nasmoApiDto = JacksonUtils.fromJson(result, FindNasmoApiDto.class);

            return nasmoApiDto.getBody().get(0).convert();
        } catch (Exception e) {
            return null;
        } finally {
            client.close();
        }
    }

    public List<TopDrivingNasmo> getTopDrivingNasmoList(FindTopDrivingNasmoListRequest request){
        TopDrivingNasmoListResponse response = nasmoApiRetryClient.getTopDrivingNasmoList(request);
        return response.converts();
    }

    public TopDrivingNasmo getTopDrivingNasmoShot(FindTopDrivingNasmoShotRequest request){
        TopDrivingNasmoShotResponse response = nasmoApiRetryClient.getTopDrivingNasmoShot(request);
        return response.convert();
    }

    public List<AcademyNasmo> selectNasmoList(FindNasmoListRequest request){
        TopDrivingNasmoListResponse response = nasmoApiRetryClient.selectNasmoList(request);
        return response.nasmoConverts();
    }

    public AcademyNasmo selectView(FindNasmoViewRequest request){
        NasmoVideoViewResponse response = nasmoApiRetryClient.selectView(request);
        return response.convert();
    }

    public AcademyNasmo selectLastCount(FindNasmoLastCountRequest request){
        NasmoLastCountResponse response = nasmoApiRetryClient.selectLastCount(request);
        return response.convert();
    }

    public AcademyNasmo selectViewByClubAndDate(FindViewByClubAndDateRequest request){
        NasmoViewResponse response = nasmoApiRetryClient.selectViewByClubAndDate(request);
        return response.convert();
    }

    public List<Driving> selectGa2FieldPracticeClubList(FindGa2FieldPracticeClubListRequest request){
        Ga2FieldPracticeClubListResponse response = nasmoApiRetryClient.selectGa2FieldPracticeClubList(request);
        return response.converts();
    }

    public List<Driving> selectGa2ClubList(FindGa2FieldPracticeClubListRequest request){
        Ga2ClubListResponse response = nasmoApiRetryClient.selectGa2ClubList(request);
        return response.converts();
    }

    public AcademyNasmo selectNasmo(FindNasmoRequest request){
        NasmoApiResponse response = nasmoApiRetryClient.selectNasmo(request);
        return response.convert();
    }

    public AcademyNasmo selectSideNasmo(FindSideNasmoRequest request){
        SideNasmoResponse response = nasmoApiRetryClient.selectSideNasmo(request);
        return response.convert();
    }

    public AcademyNasmo selectShareNasmo(FindTopDrivingNasmoShotSnakeCaseRequest request){
        NasmoApiResponse response = nasmoApiRetryClient.selectShareNasmo(request);
        return response.convert();
    }

    public AcademyNasmo selectShareNasmoDetail(FindNasmoViewSnakeRequest request){
        NasmoApiResponse response = nasmoApiRetryClient.selectShareNasmoDetail(request);
        return response.convert();
    }

}

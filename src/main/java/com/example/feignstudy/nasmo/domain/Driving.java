package com.example.feignstudy.nasmo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Driving {
	private String date;		//연습일자
	private String clubLists;	//사용한클럽목록
	private Long clubNo;		//클럽번호
	private String club;			//클럽명
	private Long minitue;		//연습 시간
	private Long balls;			//연습 볼수
	private Long hook;			//훅 퍼센트
	private Long straight;		//스트레이트  퍼센트
	private Long slice;			//슬라이스  퍼센트
	private Long distance;		//평균비거리
	private Long carry;			//평균캐리
	private Long ballSpeed;		//볼스피드
	private Long headSpeed;		//헤드스피드
	private Long angle;			//발사각
	private Long targetSuccess;	//타켓안착률
	private Float ipDistanceOut;		//IP 지점으로부터 벗어난 좌우 거리
	private Float ipDistanceTb;		//IP 지점으로부터 벗어난 상하 거리
	private String nasmoYn;	//나스모 유무
	private Integer modeId;
	private Float standardDevisionX;
	private Float standardDevisionY;
	private Long totalShotCnt;
	private Long excellentShotCnt;
	private Long niceShotCnt;
	private Long setDistance;
	private Integer clubGroupCode;
	private Long excellentRate;
	private Long niceRate;
	private Long successRate;
	private Long spinBackAvg;	//백스핀 평균
	private String isRequestDate;


}

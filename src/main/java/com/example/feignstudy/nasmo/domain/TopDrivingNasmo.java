package com.example.feignstudy.nasmo.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TopDrivingNasmo {
	private Integer size;
	private Integer nasmoId;
	private Integer usrNo;
	private Integer club;
	private Integer ballPathCode;
	private Integer shotFlag;
	private Float carry;
	private Float ipDistanceOut;
	private Float topHeight;
	private Float directionAngle;
	private Integer spinBack;
	private Integer spinSide;
	private Integer viewType;
	private Float setDistance;
	private Integer videoId;
	private String filePath;
	private String fileName;
	private String imageFilePath;
	private String imageFileName;
	private Date date;

	private Float distance;
	private Float ballSpeed;
	private Float ballAngle;
	private Float faceAngle;
	private String dateTimeStamp;
	private Integer reqStatus;		//ai 분석 요청 상태(0:분석중, 1:분석완료, 2:분석실패)
	private Long swingResultId;		//onDevice 분석결과 key

	
}

package com.example.feignstudy.nasmo.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AcademyNasmo {

	private String clubName;
	private Integer clubNo;
	private Integer mode;
	private String modeName;
	private String image;
	private Integer ballType;
	private String regdate;
	private String videoUrl;
	private String type;
	private Integer count;
	private String storeMethod;

	private String sideVideoUrl;
	private String sideImage;
	private Boolean shareFlag;
	private Integer favoriteFlag;
	private Integer favoriteSeq;

	private Integer reqStatus;		//ai 분석 요청 상태(0:분석중, 1:분석완료, 2:분석실패)
	private Integer aiReqId;			//ai 요청로그 아이디
	private String moviePath;



	private Integer size;

	private Integer nasmoId;

	private Integer usrNo;

	private Integer club;

	private Integer ballPathCode;

	private Integer shotFlag;

	private Integer carry;

	private Integer ipDistanceOut;
		private Integer topHeight;

	private Integer directionAngle;
	private Integer spinBack;
	private Integer spinSide;
	private Integer viewType;
	private Integer setDistance;
	private Integer videoId;
	private String filePath;
	private String fileName;
	private String imageFilePath;
	private String imageFileName;
	private String date;

	private String dateTimeStamp;


	private Float distance;
	private Float ballSpeed;
	private Float ballAngle;
	private Float faceAngle;

	//AI 레슨 드릴 관련
	private Integer resultId;
	private String errorKey;
	private String errorName;
	private Integer errorLevel;
	private String url;
	private String thumbUrl;
	private String remark;

	// onDevice AI 분석 결과 키 저장
	private Long swingResultId;

	//연도별 검색 관련
	private Integer year;

}

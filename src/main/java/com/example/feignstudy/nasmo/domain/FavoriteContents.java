package com.example.feignstudy.nasmo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 즐겨찾기
 * @author dssp03
 *
 */
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FavoriteContents {

	private Integer rownum;
	private Integer favoriteSeq;
	private Integer favoriteType;
	private Integer contentId;
	private Integer saveMedia;
	private Date regdate;
	private String title;
	private String message;
	private String thumbnail;
	private Integer videoId;
	private Integer nasmoType;
	private Integer viewType;
	private String fileName;
	private Integer userNo;
}

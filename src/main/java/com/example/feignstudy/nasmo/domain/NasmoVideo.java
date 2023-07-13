package com.example.feignstudy.nasmo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class NasmoVideo {
    private int videoId;
    private int fileExtension;
    private String nasmoFileSrc;
    private String nasmoThumbImgSrc;
    private String modeName;

}

package com.example.feignstudy.nasmo.api.response;

import java.util.Set;
import lombok.Getter;

@Getter
public class UserLoginResponse {
    private Long userId;
    private String accessToken;
    private String refreshToken;
    private Set<UserRoleType> userType;
}

package com.example.feignstudy.nasmo.api.response;

public enum UserRoleType {
    USER("USER"),
    ADMIN("ADMIN");

    UserRoleType(String value) {
        this.value = value;
    }

    private  String value;
}

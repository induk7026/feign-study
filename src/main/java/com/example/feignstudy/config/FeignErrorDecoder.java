package com.example.feignstudy.config;

import static feign.FeignException.errorStatus;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FeignErrorDecoder implements ErrorDecoder {

    private static final ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
    @Override
    public Exception decode(String methodKey, Response response) {
        if (response.status() >= 500 && response.status() <= 599) {
            return errorStatus(methodKey, response);
        }

        if (response.status() >= 400 && response.status() <= 499) {
            return errorStatus(methodKey, response);
        }

        return errorStatus(methodKey, response);
    }


}

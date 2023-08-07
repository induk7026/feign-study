package com.example.feignstudy.util;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public final class JacksonUtils {

    private static final ObjectMapper mapper;
    private static final ObjectMapper visibleMapper;
    private static final JsonFactory jsonFactory;
    static {
        mapper = new ObjectMapper();

        visibleMapper = new ObjectMapper().setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
        jsonFactory = new JsonFactory();
    }

    private JacksonUtils() {
    }

    public static ObjectMapper getMapper() {
        return mapper;
    }
    public static <T> T fromJson(String json, Class<T> clazz) {
        return readValue(json, clazz, mapper);
    }

    private static <T> T readValue(String json, Class<T> clazz, ObjectMapper mapper) {
        try {
            return mapper.readValue(json, clazz);
        } catch (IOException e) {
            try {
                return clazz.newInstance();
            } catch (InstantiationException e1) {
                e1.printStackTrace();
                return null;
            } catch (IllegalAccessException e1) {
                e1.printStackTrace();
                return null;
            }
        }
    }


}

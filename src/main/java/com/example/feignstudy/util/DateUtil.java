package com.example.feignstudy.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static final SimpleDateFormat DEFAULT_FORMATTER = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final SimpleDateFormat FORMATTER = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");

    public static Date parseAsDate(String datetime) {
        try {
            return FORMATTER.parse(datetime);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static Date defaltParseAsDate(String datetime) {
        try {
            return DEFAULT_FORMATTER.parse(datetime);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}

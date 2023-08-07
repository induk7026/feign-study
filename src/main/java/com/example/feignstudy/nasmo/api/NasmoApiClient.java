package com.example.feignstudy.nasmo.api;


import com.example.feignstudy.util.JacksonUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.springframework.http.MediaType;

import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;


public class NasmoApiClient {
    private static final String CONTENT_TYPE = "Content-type";
    private static final int TIMEOUT = 2000;
    public static final List<NameValuePair> EMPTY = new ArrayList<>();

    private static final RequestConfig requestConfig = RequestConfig.custom()
            .setSocketTimeout(TIMEOUT)
            .setConnectTimeout(TIMEOUT)
            .setConnectionRequestTimeout(TIMEOUT)
            .build();

    private NasmoApiClient() {
    }

    public static HttpGet getClient(String uri, List<NameValuePair> params) {
        return getClient(uri, EMPTY, params);
    }

    public static HttpGet getClient(String uri, List<NameValuePair> headers, List<NameValuePair> params) {
        try {
            String url = "https://0l6lglqx6b.execute-api.ap-northeast-2.amazonaws.com/qa/gdr/nasmo" + uri;

            URIBuilder uriBuilder = new URIBuilder(url).setParameters(params);
            HttpGet httpGet = new HttpGet(uriBuilder.build());
            httpGet.setConfig(requestConfig);

            httpGet.setHeaders(getHeader());
            for (NameValuePair header : headers) {
                httpGet.setHeader(header.getName(), header.getValue());
            }

            return httpGet;
        } catch (NoSuchAlgorithmException e) {
            return null;
        } catch (URISyntaxException | InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }

    public static HttpPost postClient(String uri, Object body) {
        try {
            String jsonValue = JacksonUtils.getMapper().writeValueAsString(body);
            return postClient(uri, new StringEntity(jsonValue, StandardCharsets.UTF_8));
        } catch (Exception e) {
            return null;
        }
    }

    public static HttpPost postClient(String uri, HttpEntity entity) {
        try {
            Header[] header = getHeader();
            return postClient(uri, header, entity);
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            return null;
        }
    }

    public static HttpPost postClient(String uri, Header[] headers, HttpEntity entity) {
        String url = "https://0l6lglqx6b.execute-api.ap-northeast-2.amazonaws.com/qa/gdr/nasmo" + uri;

        HttpPost httpPost = new HttpPost(url);
        httpPost.setConfig(requestConfig);

        httpPost.setHeaders(headers);
        httpPost.setEntity(entity);

        return httpPost;
    }


    private static Header[] getHeader()
            throws InvalidKeyException, NoSuchAlgorithmException {
        List<BasicHeader> headers = new ArrayList<>();

        headers.add(new BasicHeader(CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE));
        return headers.toArray(new Header[0]);
    }
}

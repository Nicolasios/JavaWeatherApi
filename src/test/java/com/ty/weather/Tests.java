package com.ty.weather;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ty.weather.common.RestResult;
import com.ty.weather.entity.Content;
import com.ty.weather.service.request.HttpClientService;
import com.ty.weather.url.DailyUrl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;



import java.io.UnsupportedEncodingException;
import java.security.SignatureException;

@SpringBootTest
public class Tests {
    @Autowired
    public HttpClientService httpClientService;

    @Test
    void getUrl() throws SignatureException, UnsupportedEncodingException {
        DailyUrl demo = new DailyUrl();
        String url = demo.generateGetDiaryWeatherURL("shanghai", "zh-Hans",
                "c", "1", "1");
        String weather = httpClientService.doGet(url);
        Content content = JSON.parseObject(weather, Content.class);
        System.out.println(content.toString());
    }
}

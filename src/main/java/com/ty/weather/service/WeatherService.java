package com.ty.weather.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ty.weather.constant.Constant;
import com.ty.weather.entity.Content;
import com.ty.weather.entity.Daily;
import com.ty.weather.entity.Result;
import com.ty.weather.entity.WeatherEntity;
import com.ty.weather.service.request.HttpClientService;
import com.ty.weather.url.DailyUrl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class WeatherService {

    @Resource
    HttpClientService httpClientService;

    public List<WeatherEntity> getWeather(String location) {
        DailyUrl demo = new DailyUrl();
        String url = demo.generateGetDiaryWeatherURL(location, "zh-Hans",
                "c", "1", "1");
        String weather = httpClientService.doGet(url);
        log.info("weather:{}",weather);
        if(StringUtils.isEmpty(weather)){
            return null;
        }
        Content content = JSON.parseObject(weather, Content.class);
        List<WeatherEntity> weatherEntities = toWeatherEntity(content);
        return weatherEntities;
    }

    private List<WeatherEntity> toWeatherEntity(Content content){
        List<WeatherEntity> weatherEntities = new ArrayList<>();

        List<Result> results = content.getResults();
        for(Result r:results){
            for(Daily d: r.getDaily()){
                WeatherEntity w = new WeatherEntity();

                w.setAddress(r.getLocation().getPath());

                w.setTime(d.getDate());
                w.setHigh(d.getHigh());
                w.setLow(d.getLow());
                w.setHumidity(d.getHumidity());
                w.setRainall(d.getRainfall());
                w.setTextDay(d.getText_day());
                w.setTextNight(d.getText_night());
                w.setWindDirection(d.getWind_direction());
                w.setWindSpeed(d.getWind_speed());

                w.setLastUpdate(r.getLast_update());

                weatherEntities.add(w);
            }
        }
        return weatherEntities;
    }

}

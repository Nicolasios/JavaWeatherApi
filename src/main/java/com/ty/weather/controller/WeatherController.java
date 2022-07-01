package com.ty.weather.controller;

import com.ty.weather.common.PageResult;
import com.ty.weather.common.RestResult;
import com.ty.weather.constant.Constant;
import com.ty.weather.entity.WeatherEntity;
import com.ty.weather.repository.WeatherRepository;
import com.ty.weather.service.WeatherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/weather")
public class WeatherController {

    @Resource
    WeatherService weatherService;
    @Resource
    WeatherRepository weatherRepository;

    @GetMapping("/getAndSaveWeather")
    public RestResult<List<WeatherEntity>> getWeather(@Param("location") String location){
        List<WeatherEntity> weather = weatherService.getWeather(location);
        if(weather==null){
            return PageResult.error(Constant.ERROR,"未查询到数据");
        }
        List<WeatherEntity> weatherEntities = weatherRepository.saveAll(weather);
        return PageResult.ok(Constant.OK,"查询成功",weatherEntities);
    }
}

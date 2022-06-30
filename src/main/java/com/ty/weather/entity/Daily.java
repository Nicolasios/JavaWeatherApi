package com.ty.weather.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Daily implements Serializable {
    public String date;
    public String code_day;
    public Double rainfall;
    public String text_night;
    public String wind_direction;
    public Integer high;
    public String precip;
    public Integer low;
    public String wind_scale;
    public String text_day;
    public String wind_direction_degree;
    public Integer humidity;
    public Double wind_speed;
}

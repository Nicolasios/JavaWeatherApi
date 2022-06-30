package com.ty.weather.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class Location implements Serializable {

    public String country;

    public String path;

    public String timezone;

    public String timezone_offset;

    public String name;

    public String id;
}

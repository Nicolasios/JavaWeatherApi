package com.ty.weather.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Result implements Serializable {

    List<Daily> daily;

    String last_update;

    Location location;
}

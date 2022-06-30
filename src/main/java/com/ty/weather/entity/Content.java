package com.ty.weather.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class Content implements Serializable {
    List<Result> results;
}

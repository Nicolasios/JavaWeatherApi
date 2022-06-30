package com.ty.weather.repository;

import com.ty.weather.entity.WeatherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface WeatherRepository extends JpaSpecificationExecutor<WeatherEntity>,JpaRepository<WeatherEntity,Long>{
}

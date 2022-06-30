package com.ty.weather.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "weather_info")
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class WeatherEntity implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;


    @Column(name = "address")
    private String  address;

    @Column(name = "time")
    private String  time;

    @Column(name = "text_day")
    private String  textDay;

    @Column(name = "text_night")
    private String  textNight;

    @Column(name = "high")
    private Integer  high;

    @Column(name = "low")
    private Integer  low;

    @Column(name = "rainfall")
    private Double  rainall;

    @Column(name = "wind_direction")
    private String  windDirection;

    @Column(name = "wind_speed")
    private Double  windSpeed;

    @Column(name = "humidity")
    private Integer  humidity;

    @Column(name = "last_update")
    private String lastUpdate;

}

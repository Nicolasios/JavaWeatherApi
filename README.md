# Weather

## 目录结构

```
├── README.md
├── bin
│   └── init.sql
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── ty
│   │   │           └── weather
│   │   │               ├── WeatherApplication.java
│   │   │               ├── common
│   │   │               │   ├── PageResult.java
│   │   │               │   ├── RestResult.java
│   │   │               │   └── ResultCodeEnum.java
│   │   │               ├── config
│   │   │               │   ├── MyWebMvcConfig.java
│   │   │               │   └── RestTemplateConfig.java
│   │   │               ├── constant
│   │   │               │   └── Constant.java
│   │   │               ├── controller
│   │   │               │   └── WeatherController.java
│   │   │               ├── entity
│   │   │               │   ├── Content.java
│   │   │               │   ├── Daily.java
│   │   │               │   ├── Location.java
│   │   │               │   ├── Result.java
│   │   │               │   └── WeatherEntity.java
│   │   │               ├── repository
│   │   │               │   └── WeatherRepository.java
│   │   │               ├── service
│   │   │               │   ├── WeatherService.java
│   │   │               │   └── request
│   │   │               │       └── HttpClientService.java
│   │   │               └── url
│   │   │                   └── DailyUrl.java
│   │   └── resources
│   │       ├── application.properties
│   │       ├── static
│   │       └── templates
│   └── test
│       └── java
│           └── com
│               └── ty
│                   └── weather
│                       ├── Tests.java
│                       └── WeatherApplicationTests.java
└── weather.iml
```

> 用来实验 `心知天气Api`获取全国天气情况


## 数据库初始化脚本

/bin/init.sql

## 相关步骤
1. 参照心知天气api文档,生成https——url

2. 通过 `HttpClient`构建请求，发送请求并且获取返回值

3. 解析获取到的json格式数据，生成天气信息

4. 将获取到的天气信息保存到数据库中

## 实现的接口

- [x] 获取并保存天气信息
```http request
# 根据地名获取对应天气信息
GET http://<ip>:<port>/api/v1/weather/getAndSaveWeather
```
······ 待补充

## 实现的一些utils
- [x] `PageResult`:分页查询
- [x] `RestResult`:服务端返回结果
- [x] `MyWebMvxConfig`:跨域服务设置
- [ ] `RestTemplate`:请求
- [x] `HttpClientService`: 构建get请求
- [x] `DailyUrl`:请求url生成

## 新增的解决办法
1. url中新增构建新功能的url生成
2. 如果必要增加实体类
3. 增加sql语句，创建对应的表
4. 构建Service和Controller
# Weather

目录结构

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

用来实验 `心知天气Api`

通过httpclient构建请求获取天气信息并存到数据库中

具有自己的返回信息设置

无前端架构


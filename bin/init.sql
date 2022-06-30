DROP DATABASE IF EXISTS `weather`;
CREATE DATABASE `weather` character set utf8 collate utf8_general_ci;

USE `weather`;

DROP TABLE IF EXISTS 'weather_info';
CREATE TABLE `weather_info` (
                                `id` bigint(20) NOT NULL COMMENT 'id',
                                `address` varchar(255) NOT NULL COMMENT '地名',
                                `time` date NOT NULL COMMENT '日期信息',
                                `text_day` varchar(255) DEFAULT NULL COMMENT '白天天气',
                                `text_night` varchar(255) DEFAULT NULL COMMENT '晚间天气',
                                `high` int(5) DEFAULT NULL COMMENT '最高气温',
                                `low` int(5) DEFAULT NULL COMMENT '最低气温',
                                `rainfall` int(255) DEFAULT NULL COMMENT '降雨量',
                                `wind_direction` varchar(255) DEFAULT NULL COMMENT '风向',
                                `weed_speed` int(20) DEFAULT NULL COMMENT '风速',
                                `humidity` int(10) DEFAULT NULL COMMENT '舒适度',
                                `last_update` datetime DEFAULT NULL COMMENT '最后更新时间',
                                PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3
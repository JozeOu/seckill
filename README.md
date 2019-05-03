# Java 高并发秒杀系统 Seckill

## 项目介绍

![plateform](https://img.shields.io/badge/plateform-windows-lightgrey.svg) 
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-v2019.1.1-blue.svg) 
![JDK](https://img.shields.io/badge/JDK-v1.8.0_121-3A5FCD.svg) 
![Maven](https://img.shields.io/badge/Maven-v3.6.1-ff69b4.svg) 
![MySQL](https://img.shields.io/badge/MySQL-v8.0.15-20B2AA.svg) 
![SSM](https://img.shields.io/badge/SSM-framework-yellow.svg) 
![build](https://img.shields.io/badge/build-passing-brightgreen.svg) 

本项目使用 SSM 框架开发高并发限时秒杀 web 应用。

**项目功能介绍：**

- 商品秒杀开启前，用户能看到商品秒杀倒计时，但不能进行秒杀；
- 商品秒杀开启时，可以进行秒杀，一个账号对同个商品只能秒杀一次；
- 商品秒杀结束后，显示商品秒杀已结束，阻止用户进行秒杀。

## 开发进度
- 已完成：Dao 层和 Service 层
- 待做：Web层和高并发优化
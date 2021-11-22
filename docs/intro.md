##  优点

1. 独立运行的 Spring 项目Spring Boot 可以以 jar 包的形式独立运行，Spring Boot 项目只需通过命令“ java–jar xx.jar” 即可运行。
2. 内嵌 Servlet 容器Spring Boot 使用嵌入式的 Servlet 容器（例如 Tomcat、Jetty 或者 Undertow 等），应用无需打成 WAR 包 。
3. 提供 starter 简化 Maven 配置Spring Boot 提供了一系列的“starter”项目对象模型（POMS）来简化 Maven 配置。
4. 提供了大量的自动配置Spring Boot 提供了大量的默认自动配置，来简化项目的开发，开发人员也通过配置文件修改默认配置。
5. 自带应用监控Spring Boot 可以对正在运行的项目提供监控。
6. 无代码生成和 xml 配置Spring Boot 不需要任何 xml 配置即可实现 Spring 的所有配置。

## starter
Spring Boot 将日常企业应用研发中的各种场景都抽取出来，做成一个个的 starter（启动器），starter 中整合了该场景下各种可能用到的依赖。

只需要在 Maven 中引入 starter 依赖，SpringBoot 就能自动扫描到要加载的信息并启动相应的默认配置。starter 提供了大量的自动配置，让用户摆脱了处理各种依赖和配置的困扰。所有这些 starter 都遵循着约定成俗的默认配置，并允许用户调整这些配置，即遵循“约定大于配置”的原则。

`spring-boot-starter-parent` 是所有 Spring Boot 项目的父级依赖，它被称为 Spring Boot 的版本仲裁中心，可以对项目内的部分常用依赖进行统一管理

Spring Boot 项目可以通过继承spring-boot-starter-parent 来获得一些合理的默认配置，它主要提供了以下特性：
- 默认 JDK 版本（Java 8）
- 默认字符集（UTF-8）
- 依赖管理功能
- 资源过滤
- 默认插件配置
- 识别 application.properties 和 application.yml 类型的配置文件

## 导包
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>8.0.25</version>
    </dependency>
</dependencies>
```

## mysql
mac m1芯片，安装好mysql之后，配置好bash之后，登录不了
报错 `ERROR 2002 (HY000): Can‘t connect to local MySQL server through socket ‘/tmp/mysql.sock‘ (2)`
```shell
# 第一步：找到mysql的安装目录，我的是：/usr/local/mysql，不用去mysql底下的bin目录
# 第二步：执行 sudo ./support-files/mysql.server start 
# 完成以上两步，问题已解决
```

## more urls
- [spring boot 系列博客](https://www.cnblogs.com/ityouknow/p/5662753.html)
- [spring boot 系列视频](https://www.bilibili.com/video/BV1PE411i7CV)


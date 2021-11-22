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
</dependencies>
```

## more urls
https://www.bilibili.com/video/BV1PE411i7CV?from=search&seid=1700333346121863110&spm_id_from=333.337.0.0

https://www.roncoo.com/course/view/e4189c9db6474745b5e578983cddd112

https://www.roncoo.com/course/view/c99516ea604d4053908c1768d6deee3d#boxTwo

https://github.com/roncoo/roncoo-jui-springboo

https://blog.csdn.net/u012152619/article/details/51485152

https://blog.csdn.net/u012152619


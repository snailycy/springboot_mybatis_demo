# springboot_mybatis_demo
整合SpringBoot，Mybatis框架写的demo，支持多线程并发执行定时任务，支持多数据源，整个项目可以直接运用到项目架构中

## 项目配置说明
application.properties文件中
```
//这里指定项目根路径
server.context-path=/wumeijieapi
```
datasource.properties文件中
```
//配置多数据源数据库连接参数
//datasource
spring.datasource.driverClassName=com.mysql.jdbc.Driver
spring.datasource.url=jdbc:mysql://192.168.0.1:3306/demodb
spring.datasource.username=root
spring.datasource.password=

//datasource 2
custom.datasource.names=demodb2
custom.datasource.demodb2.driver-class-name=com.mysql.jdbc.Driver
custom.datasource.demodb2.url=jdbc:mysql://192.168.0.2:3306/demodb2
custom.datasource.demodb2.username=root
custom.datasource.demodb2.password=

//使用另一台服务器的数据库
DynamicDataSourceContextHolder.setDataSourceType("demodb2");
DynamicDataSourceContextHolder.clearDataSourceType();
```

## 使用说明
调用地址样例：
http://127.0.0.1:8080/wumeijieapi/order/getCountByMerchantIdOrderSn?platformId=1&merchantId=1&orderSn=161124-123456789

# 指定基础镜像
FROM openjdk:8-jre-alpine
#作者
MAINTAINER lyx
# 将项目的jar文件作为app.jar添加到容器,app.jar就是别名
ADD target/admin-service-0.0.1-SNAPSHOT.jar app.jar
# 声明服务运行在9090端口
EXPOSE 9090

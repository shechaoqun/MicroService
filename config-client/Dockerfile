#指定基础镜像名称
FROM java:8

RUN mkdir /app
WORKDIR /app

#将复制指定的 src 到容器中的 dest
ADD build/libs/config-client-0.0.1.jar /app
RUN ln -s config-client-0.0.1.jar config-client-latest.jar

#运行指定的命令
CMD java -jar /app/config-client-latest.jar

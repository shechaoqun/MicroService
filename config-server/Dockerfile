FROM java:8

RUN mkdir /app
WORKDIR /app

ADD build/libs/config-server-0.0.1.jar /app
RUN ln -s config-server-0.0.1.jar configserver-latest.jar
CMD java -jar /app/configserver-latest.jar
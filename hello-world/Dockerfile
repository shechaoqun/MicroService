FROM java:8

RUN mkdir /app
WORKDIR /app

ADD build/libs/hello-world-0.0.1-SNAPSHOT.jar /app
RUN ln -s hello-world-0.0.1-SNAPSHOT.jar helloworld-latest.jar
CMD java -jar /app/helloworld-latest.jar

FROM adoptopenjdk/openjdk8
LABEL maintainer="mbio study <https://github.com/mbiostudy/make-blog>"
ARG JAR_FILE
COPY target/${JAR_FILE} app.jar
ENV LC_ALL=C.UTF-8
ENV JAVA_OPTS="-server"
ENV GC_OPTS="-XX:+UseG1GC -verbose:gc -XX:+PrintGCTimeStamps -Xloggc:gc.log"
ENV ADDITIONAL_PROPERTIES=""
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS $GC_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar $ADDITIONAL_PROPERTIES"]
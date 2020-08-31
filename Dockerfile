FROM openjdk:14.0.2-oracle

COPY . /kangwonapitest
WORKDIR /kangwonapitest

CMD ["./gradlew", "bootRun"]
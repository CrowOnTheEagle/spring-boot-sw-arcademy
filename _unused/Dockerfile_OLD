## testcomment
## The filename for docker is MUST BE Dockerfile
## 도커파일의 이름은 Dockerfile이어야 함

# set base image
# 베이스 이미지 지정
FROM openjdk:17

## copy jar file into docker's OS
## jar파일을 도커 안에 복사
COPY ./target/spring-boot-sw-arcademy-0.0.1-SNAPSHOT.jar /usr/src/SWArcademy/

## cd
WORKDIR /usr/src/SWArcademy

## Open Container Port (Not Applied; Settings Metadata)
## 컨테이너 포트 개방(적용은 안됨, 오픈될것이라고만 알려줌, 세팅용 메타데이터)
EXPOSE 8081

## excute run jar file command
## jar 파일 실행 명령어 실행
CMD ["java", "-jar", "spring-boot-sw-arcademy-0.0.1-SNAPSHOT.jar"]
@REM Build to jar and push to docker
@REM jar 파일 빌드 후 docker로 푸시
echo off

@REM SET /a version = 3

echo "Build Start..."

cd C:\spring-boot-sw-arcademy
call mvnw.cmd clean package

cd ./taget
docker build -t crowontheeagle/spring01-service:latest .
docker push crowontheeagle/spring01-service:latest
@REM docker run --name TestContainer -dp 8081:8081 crowontheeagle/spring01-service:latest

echo "Build Finish..."
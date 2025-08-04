## Build to jar and push to docker
## jar 파일 빌드 후 docker로 푸시
"""
작성자: 이동희
Writer: DongHee Lee

용도(Purpose):
    스프링 부트 빌드 자동화 도구입니다. 빌드 후 자동으로 도커 이미지로 업로드합니다.
    This is an automated tool for building Spring Boot projects. It automatically uploads Docker images once the build is complete.
"""
import os, sys

DockerRun = False
if("-autorun" in sys.argv or "-run" in sys.argv):
    DockerRun = True
if("-help" in sys.argv or "-h" in sys.argv):
    print("""도움말(HELP)

사용법(usage):
python ./(파이선 파일 이름) [-플래그]
python ./(python file name) [-flags]

플래그 목록(list of flags):
-h or -help: 도움말 목록을 출력합니다.
             Print help menu.
-autorun or -run: 빌드 후 도커 컨테이너를 실행합니다.
                  Run docker container after build.
-linux or -l: 빌드 후 ssh로 리눅스에 접속해 도커 컨테이너를 실행합니다.
              Once built, connect to the Linux server using SSH, then run the Docker container.""")
    sys.exit()

VERSION = input("빌드 버전 입력(Please enter the build version): ")

os.system("cd C:/spring-boot-sw-arcademy")
os.system("mvnw.cmd clean package")

os.system("cd ./taget")
os.system(f"docker build -t crowontheeagle/spring01-service:{VERSION} .")
os.system(f"docker push crowontheeagle/spring01-service:{VERSION}")

if(DockerRun):
    ## answer = input("도커 컨테이너를 실행하시겠습니까?(Do you want run docker container?)(Y/N): ")
    ##if(answer == 'y' or answer == 'Y'):
    if("-linux" in sys.argv or "-l" in sys.argv):
        os.system(f"ssh blizkrig553@localhost \"cd /home/blizkrig553/Spring01 && docker compose pull && docker compose up -d\"")
    else:
        os.system(f"docker run --name TestContainer -dp 8081:8081 crowontheeagle/spring01-service:{VERSION}")
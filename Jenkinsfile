pipeline {
    agent any

    // Set tools for build java project
    // 자바 빌드에 사용할 툴 지정
    tools {
        maven "MyMaven"
    }

    stages {
        // Check jenkins is connected to github
        // 깃허브와 연동 확인
        stage('0. 연결 확인') {
            steps {
                echo '스테이지 출발'
            }
        }

        // Build java project with maven
        // 메이븐을 이용해 자바 프로젝트 빌드
        stage('1. 프로젝트 빌드') {
            steps {
                echo 'Maven 빌드 시작...'
                sh 'mvn clean package'
            }
        }

        // check docker version
        stage('2. Docker 버전 확인') {
           steps {
               sh 'docker version'
           }
        }

        // build docker
        stage('3. 도커 빌드') {
            steps {
                sh 'docker build -t ex02-app:latest .'
            }
        }

        // Push to docker
        stage('4. Docker에 푸시') {
            steps {
                withCredentials([usernamePassword(
                    credentialsId: 'dockerhub-card',
                    usernameVariable: 'DOCKERHUB_USERNAME',
                    passwordVariable: 'DOCKERHUB_PASSWORD'
                )]) {
                    sh '''
                    echo "$DOCKERHUB_PASSWORD" | docker login -u "$DOCKERHUB_USERNAME" --password-stdin
                    docker tag ex02-app:latest $DOCKERHUB_USERNAME/ex02-app:latest
                    docker push $DOCKERHUB_USERNAME/ex02-app:latest
                    '''
                }
            }
        }
    }
}
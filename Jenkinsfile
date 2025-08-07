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
        // 메이븐을 이용해 자바 빌드
        stage('1. 메이븐 빌드') {
            steps {
                echo 'Maven 빌드 시작...'
                sh 'mvn clean package'
            }
        }

        // check docker version
        // 도커 버전 확인
        stage('2. Docker 버전 확인') {
            steps {
                sh 'docker version'
            }
        }
    }
}
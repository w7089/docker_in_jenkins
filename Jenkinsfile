pipeline {
    agent  {
        label 'dind-agent'
    }

    stages {
        stage("build image") {
            steps {
                script {
                    sh "docker build jenkins -t docker-in-jenkins"
                }
            }
        }
    }
}
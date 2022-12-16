pipeline {
    agent  {
        label 'dind-agent'
    }

    stages {
        stage("build image") {
            steps {
                script {
                    sh "podman build jenkins -t docker-in-jenkins"
                }
            }
        }
    }
}

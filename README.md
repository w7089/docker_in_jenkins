# docker_in_jenkins

Demo project showing how to create jenkins container with docker client installed in it

```
$ docker-compose up -d
Creating network "dockerinjenkins_default" with the default driver
Creating dockerinjenkins_jenkins_1 ... 
Creating dockerinjenkins_jenkins_1 ... done
rok@rok:~/dev/docker_in_jenkins$ docker exec -it dockerinjenkins_jenkins_1 bash

jenkins@d2b79717c6d5:/$ docker version
Client: Docker Engine - Community
 Version:           19.03.6
 ...
```

Jenkins image is based on image from [this](https://github.com/w7089/jenkins-monitoring) project

Read more info about using this image at [CI/CD using Jenkins and Docker](https://www.rokpoto.com/ci-cd-using-jenkins-and-docker/#running-cicd-pipeline-in-jenkins)

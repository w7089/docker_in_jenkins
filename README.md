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

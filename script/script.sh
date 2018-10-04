#!/usr/bin/env bash

docker run --name mysql-server1 -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=dbtest -d mysql:8
docker build -t spring-jpa-demo .
docker run --name jpa-manytomany -p 8585:8585 --link mysql-server1:mysql -d spring-jpa-demo

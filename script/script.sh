#!/usr/bin/env bash

docker run --name mysql-server -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=test_db -d mysql:8
docker build -t spring-jpa-demo .
docker run --name jpa-manytomany -p 8585:8080 --link mysql-server:mysql -d spring-jpa-demo

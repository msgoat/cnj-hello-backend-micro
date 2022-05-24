# cnj-hello-backend-micro

Simplest possible cloud native java application based on Eclipse Micro Profile.

## Status

![Build status](https://drone.cloudtrain.aws.msgoat.eu/api/badges/msgoat/cnj-hello-backend-micro/status.svg)

## Release Information

A changelog can be found in [changelog.md](changelog.md).

## Docker Pull Command

`docker pull docker.cloudtrain.aws.msgoat.eu/cloudtrain/cnj-hello-backend-micro`

## Run this application 

```shell 
docker run --name cnj-hello-backend-micro -p 8080:8080 docker.cloudtrain.aws.msgoat.eu/cloudtrain/cnj-hello-backend-micro
```

## Build this application

```shell 
mvn clean verify -P pre-commit-stage
```

Build results: a Docker image containing a Payara Micro Profile application.

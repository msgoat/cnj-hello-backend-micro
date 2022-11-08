# cnj-hello-backend-micro

Simplest possible cloud native java application based on Eclipse Micro Profile.

## Status

![Build status](https://codebuild.eu-west-1.amazonaws.com/badges?uuid=eyJlbmNyeXB0ZWREYXRhIjoiRm5CdjBtQ1hiU2xoT1NLNmY4SzMvRXNraXdFSFR4dDgrYkY0WnpjZWRQSGRUMkg1UkUwSVVhdDJ5bWJibGwvRmtnVzFsVU9zVmxYV3NMM1lWNjlPUG5rPSIsIml2UGFyYW1ldGVyU3BlYyI6Ik5rZlZzcHQrNlg5dko2aDUiLCJtYXRlcmlhbFNldFNlcmlhbCI6MX0%3D&branch=main)

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

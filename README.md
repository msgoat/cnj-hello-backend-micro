# cnj-hello-backend-micro

Simplest possible cloud native java application based on Eclipse Micro Profile.

## Status

![Build status](https://codebuild.eu-west-1.amazonaws.com/badges?uuid=eyJlbmNyeXB0ZWREYXRhIjoiRm5CdjBtQ1hiU2xoT1NLNmY4SzMvRXNraXdFSFR4dDgrYkY0WnpjZWRQSGRUMkg1UkUwSVVhdDJ5bWJibGwvRmtnVzFsVU9zVmxYV3NMM1lWNjlPUG5rPSIsIml2UGFyYW1ldGVyU3BlYyI6Ik5rZlZzcHQrNlg5dko2aDUiLCJtYXRlcmlhbFNldFNlcmlhbCI6MX0%3D&branch=main)

## Release Information

A changelog can be found in [changelog.md](changelog.md).

## Docker Pull Command

`docker pull docker.cloudtrain.aws.msgoat.eu/cloudtrain/cnj-hello-backend-micro`


## HOW-TO build this application locally

If all prerequisites are met, just run the following Maven command in the project folder:

```shell 
mvn clean verify -P pre-commit-stage
```

Build results: a Docker image containing the showcase application.

## HOW-TO run this showcase locally

In order to run the whole showcase locally, just run the following docker commands in the project folder:

```shell 
docker compose up -d
docker compose logs -f 
```
The showcase application will be accessible via `http://localhost:38080`.

Press `Ctlr+c` to stop tailing the container logs and run the following docker command to stop the show case:

```shell 
docker compose down
```

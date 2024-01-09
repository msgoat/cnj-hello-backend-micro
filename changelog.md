# Changelog
All notable changes to `cnj-hello-backend-micro` will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]
### Added
### Changed
### Fixed

## [8.1.0] - 2024-01-09
### Added
- added new unit-test class MessageTest to make sure Jacoco measures test coverage correctly
### Changed
- simplified POM
- upgraded Payara to version 6.2023.12
### Fixed
- improved test coverage measurement with Jacoco to include all coverage data in reports

## [8.0.0] - 2023-12-04
### Added
- build tags git branch after successful completion
- commit-stage builds produce Docker images for linux/amd64 and linux/arm64/v8 platforms now
- added JSON-B configuration class
### Changed
- upgraded Payara to version 6.2023.11
- upgraded Java to version 21
- upgraded Maven plugins and dependencies
- build now packages and pushes Helm charts
- deploy now uses packaged Helm charts
- consolidated POM with other showcases
- consolidated system tests with other showcases
- Docker images use Generational Z garbage collector by default
### Fixed
- log messages of test runs are displayed correctly now after upgrade to SLF4J 2.0.9 and using ServiceLoader for log provider lookup
- application logs are actually written to console after (re-)adding dependency slf4j-jdk14

## [7.3.0] - 2023-07-05
### Changed
- added explicit dependency to CloudTrain Maven repository to POM to simplify local builds
- allowed anonymous read access to CloudTrain Maven repository to simplify local builds
- added global docker-compose.yml file to simplify local execution
- improved documentation in README.md

## [7.2.0] - 2023-06-01
### Added
### Changed
- upgraded everything

## [7.1.0] - 2023-02-22
### Added
### Changed
- upgraded to Payara version 6.2023.2
- consolidated usage of cnj-common-test* libraries

## [7.0.0] - 2022-11-16
### Added
### Changed
- upgraded to Java 17
- added new envvar AGENT_JAVA_OPTS to configure java agents without changing the default java options

## [6.3.0] - 2022-11-11
### Added
### Changed
- upgraded to Payara version 6.2022.1
- upgraded to Jakarta EE 10

## [6.2.0] - 2022-11-08
### Added
### Changed
- moved build from Drone to AWS CodeBuild

## [6.1.0] - 2022-05-24
### Added
### Changed
- switched to Eclipse Temurin Java 11 Alpine image to shrink image size
- upgraded to Payara Micro 5.2022.2

## [6.0.0] - 2022-05-24
### Added
### Changed
- re-released version 6.0.0 after repo split

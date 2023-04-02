#!/bin/bash
set -e

./gradlew dockerBuildNative --stacktrace

docker tag loan-amortization-calculator-service:latest artyompanfutov/loan-amortization-calculator-service:latest

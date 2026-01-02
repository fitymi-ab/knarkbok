#!/usr/bin/env bash

kill -9 $(lsof -t -i :7070)

set -e

cd ..
./mvnw -B clean package
cd ./scripts

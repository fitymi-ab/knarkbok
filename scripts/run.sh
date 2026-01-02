#!/usr/bin/env bash

cd ..
./mvnw -B clean package
java -jar ./target/knarkbok-site-1.0.0.jar
cd ./scripts

#!/bin/bash

# Copy the new jar to the build location
cp -f java-app/target/*.jar jenkins/build/

echo "###########################"
echo "## Building Docker Image ##"
echo "###########################"

# Enter on build level to execute de process to build a new image
cd jenkins/build/ && docker-compose -f docker-compose-build.yml build --no-cache



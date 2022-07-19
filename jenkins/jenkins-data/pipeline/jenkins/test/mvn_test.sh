#!/bin/bash

echo "###################################"
echo "######### Testing  .JAR ###########"
echo "###################################"

docker run --rm -v $PWD/java-app:/app -v /root/.m2/:/root/.m2/ -w /app/AutomacaoPernambucanasSeleniumGrid maven:3-alpine mvn test

#! /bin/bash

docker build -t mysql ./mysql/

cp -r ../../target springboot/
docker build -t spring_app ./springboot/
rm -rf /springboot/target/


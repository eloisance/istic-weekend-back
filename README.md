### ISTIC - Project - Weekend - Backend with Spring

## Requirements
- docker
- docker-compose

## Installation
- clone this project and front project [https://github.com/eloisance/istic-weekend-front]
- build spring image > sudo mvn clean package dockerfile:build
- in folder of this project run command > sudo docker-compose up
- app should be available on [http://localhost:4200]

## Problems
- if error occurs while `sudo docker-compose up` try to start `sudo docker-compose rm` to clean up old stopped service containers and try again.
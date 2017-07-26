# microservices-eureka
eureka-service - The Eureka service which is the Service Registry.
hello-server - The Service which is going to give data to the Client.
hello-client - The Service which is going to get data from Server via the Discovery Service from the Service Registry (eureka-service).
Zuul-Server - The Service which is used as API gateway and also as Routing service which will do the service discover using Eureka Service

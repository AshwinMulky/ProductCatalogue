# productCatalogue
This application was generated using JHipster 4.14.1, you can find documentation and help at [http://www.jhipster.tech/documentation-archive/v4.14.1](http://www.jhipster.tech/documentation-archive/v4.14.1).

This is a "microservice" application intended to be part of a microservice architecture, please refer to the [Doing microservices with JHipster][] page of the documentation for more information.

This application is configured for Service Discovery and Configuration with the JHipster-Registry. On launch, it will refuse to start if it is not able to connect to the JHipster-Registry at [http://localhost:8761](http://localhost:8761). For more information, read our documentation on [Service Discovery and Configuration with the JHipster-Registry][].

## This MicroService features
Service discovery server : Jhipster registry
Type of Authentication : JWT
Database : MongoDB
Ehcache : Hazelcast
Build tool : Gradle
Running port : 8081

NOTE: If your are just trying to test the API calls without Jhipster registry then, comment line num 64 and uncomment line num 65 in the below java file.
com.globomart.catalogue.config.MicroserviceSecurityConfiguration

             //.antMatchers("/api/**").permitAll()
            .antMatchers("/management/health").permitAll()

## Development

To start your application in the dev profile, simply run:

    ./gradlew


This microservice assumes that there is a Jhipster registry running, hence it continuesly tries to register itself with registry. You may see some errors like below. It is okay. APIs will work fine.

2018-04-04 22:21:06.760 ERROR 10798 --- [tbeatExecutor-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_PRODUCTCATALOGUE/productCatalogue:4bfd5a0305d8477eb19ba6785b05a1bb - was unable to send heartbeat!
com.netflix.discovery.shared.transport.TransportException: Cannot execute request on any known server


For further instructions on how to develop with JHipster, have a look at [Using JHipster in development][].



## Building for production

To optimize the productCatalogue application for production, run:

    ./gradlew -Pprod clean bootRepackage

To ensure everything worked, run:

    java -jar build/libs/*.war


Refer to [Using JHipster in production][] for more details.

## Testing

To launch your application's tests, run:

    ./gradlew test

For more information, refer to the [Running tests page][].

## Using Docker to simplify development (optional)

You can use Docker to improve your JHipster development experience. A number of docker-compose configuration are available in the [src/main/docker](src/main/docker) folder to launch required third party services.

For example, to start a mongodb database in a docker container, run:

    docker-compose -f src/main/docker/mongodb.yml up -d

To stop it and remove the container, run:

    docker-compose -f src/main/docker/mongodb.yml down

You can also fully dockerize your application and all the services that it depends on.
To achieve this, first build a docker image of your app by running:

    ./gradlew bootRepackage -Pprod buildDocker

Then run:

    docker-compose -f src/main/docker/app.yml up -d

For more information refer to [Using Docker and Docker-Compose][], this page also contains information on the docker-compose sub-generator (`jhipster docker-compose`), which is able to generate docker configurations for one or several JHipster applications.

## Continuous Integration (optional)

To configure CI for your project, run the ci-cd sub-generator (`jhipster ci-cd`), this will let you generate configuration files for a number of Continuous Integration systems. Consult the [Setting up Continuous Integration][] page for more information.

[JHipster Homepage and latest documentation]: http://www.jhipster.tech
[JHipster 4.14.1 archive]: http://www.jhipster.tech/documentation-archive/v4.14.1
[Doing microservices with JHipster]: http://www.jhipster.tech/documentation-archive/v4.14.1/microservices-architecture/
[Using JHipster in development]: http://www.jhipster.tech/documentation-archive/v4.14.1/development/
[Service Discovery and Configuration with the JHipster-Registry]: http://www.jhipster.tech/documentation-archive/v4.14.1/microservices-architecture/#jhipster-registry
[Using Docker and Docker-Compose]: http://www.jhipster.tech/documentation-archive/v4.14.1/docker-compose
[Using JHipster in production]: http://www.jhipster.tech/documentation-archive/v4.14.1/production/
[Running tests page]: http://www.jhipster.tech/documentation-archive/v4.14.1/running-tests/
[Setting up Continuous Integration]: http://www.jhipster.tech/documentation-archive/v4.14.1/setting-up-ci/



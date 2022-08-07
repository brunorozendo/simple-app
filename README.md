
# TODO
- better logging: Change logs to be async and send to a queue.
- extract JWT_TOKEN to an external property.
- better error handling for JWT
- Implement CRUD for user/login
- remove duplicate code from all *.gradle files (repositories, plugins, ...)
- Implement
  - /api/v3/transactions/report
  - /api/v3/transaction/list
  - /api/v3/transaction
- Implement DAO layer
- UT, FT, IT

# Demo

This demo has implemented
- /api/v3/merchant/user/login
    ```
    POST http://localhost:8080/api/v3/merchant/user/login
    Accept: application/json
    Content-Type: application/json
    
    {
    "email": "demo@errrad.io",
    "password": "cjaiU8CV"
    }
    ```
- /api/v3/client
    ```
    POST http://localhost:8080/api/v3/client
    Accept: application/json
    Content-Type: application/json
    Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJleHAiOjE2NTc3NTMzOTQsInN1YiI6ImRlbW9AZmluYW5jaWFsaG91c2UuaW8iLCJpYXQiOjE2NTc3NTI3OTR9.PtjDE0HGuEdFM7ij6GaktaYsgfwJc2CvZwm0Z9nZdVA
    
    {
    "transactionId": "1-1444392550-1"
    }
    ```
    For the `client` endpoint there are NO DATA on the database;

# Structure of the project

![design of the project](https://raw.githubusercontent.com/brunorozendo/simple-app/master/design.png)

Using some ideas of the [Hexagonal Architecture](https://en.wikipedia.org/wiki/Hexagonal_architecture_(software))

## Submodules

We have the basic:
 - `api`: contains only interfaces and pojos/model, ideally with pure Java 
 - `business`: contains pure Java, which has  the proper business

And we have the implementations submodules
- `features/data`: implements `models`/`jpa` for database use
- `features/jwt`: implements the `/api/v3/merchant/user/login` and the filter for all others endpoints
- `features/client`: implements the `/api/v3/client` end point
- `features/transaction`: implements all `/api/v3/transaction/*` endpoints

And for the "glue"
- `service`: has the implementation of the spring boot and all dependencies


podman run --rm --name myDb -p 5432:5432 -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=postgres -d postgres





One or more dependencies were identified with known vulnerabilities in service:

spring-security-crypto-5.7.2.jar (pkg:maven/org.springframework.security/spring-security-crypto@5.7.2, cpe:2.3:a:pivotal_software:spring_security:5.7.2:*:*:*:*:*:*:*, cpe:2.3:a:vmware:spring_security:5.7.2:*:*:*:*:*:*:*) : CVE-2020-5408
spring-web-5.3.21.jar (pkg:maven/org.springframework/spring-web@5.3.21, cpe:2.3:a:pivotal_software:spring_framework:5.3.21:*:*:*:*:*:*:*, cpe:2.3:a:springsource:spring_framework:5.3.21:*:*:*:*:*:*:*, cpe:2.3:a:vmware:spring_framework:5.3.21:*:*:*:*:*:*:*) : CVE-2016-1000027
tomcat-embed-core-9.0.64.jar (pkg:maven/org.apache.tomcat.embed/tomcat-embed-core@9.0.64, cpe:2.3:a:apache:tomcat:9.0.64:*:*:*:*:*:*:*, cpe:2.3:a:apache_tomcat:apache_tomcat:9.0.64:*:*:*:*:*:*:*) : CVE-2022-34305
tomcat-embed-websocket-9.0.64.jar (pkg:maven/org.apache.tomcat.embed/tomcat-embed-websocket@9.0.64, cpe:2.3:a:apache:tomcat:9.0.64:*:*:*:*:*:*:*, cpe:2.3:a:apache_tomcat:apache_tomcat:9.0.64:*:*:*:*:*:*:*) : CVE-2022-34305

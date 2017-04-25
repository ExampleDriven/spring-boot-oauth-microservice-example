[![Build Status](https://travis-ci.org/ExampleDriven/spring-boot-oauth-microservice-example.svg?branch=master)](https://travis-ci.org/ExampleDriven/spring-boot-oauth-microservice-example)
# spring-boot-oauth-microservice-example

This is the source code for the blog post

???


Feature |test url
--- |---
Web (Zuul) | http://localhost:9090/
Local OAuth request | http://localhost:9090/me
Proxied OAuth request | http://localhost:9090/customer/customer/1
Proxied + Relayed OAuth request | http://localhost:9090/customer/account-relay
Trace showing OAuth token | http://localhost:9090/customer/trace


References:
- http://blog.monkey.codes/how-to-use-jwt-and-oauth-with-spring-boot/
- http://www.bubblecode.net/en/2016/01/22/understanding-oauth2/#Client_Credentials_Grant
- https://spring.io/guides/tutorials/spring-boot-oauth2/#_social_login_manual
- http://cloud.spring.io/spring-cloud-security/spring-cloud-security.html

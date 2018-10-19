# Stackoverflow issue: How to hanlde feign exception using fallback and custom errro handler

### How to run the application ?

```
git clone https://github.com/BarathArivazhagan/stackoverflow-issues.git
cd issue-52889703-feign-client-exception
cd inventory-service
./mvnw spring-boot:run 

cd ../product-service 
./mvnw spring-boot:run
```

#### Test the endpoint :

```
http://localhost:9101/inventories

output:

error response status500
error response HTTP/1.1 500
connection: close
content-length: 38
content-type: text/plain;charset=UTF-8
date: Fri, 19 Oct 2018 13:44:14 GMT

feign.Response$InputStreamBody@3df192c0
hello fallback
```

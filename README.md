# buildAndRunWithDocker


Example project how you can build and run an application with Payara Micro entirely in Docker.

You can execute the following commands in the root of he project


```
docker build --tag hello:1.0  .

docker run -d -p 8080:8080 --name hello hello:1.0

curl localhost:8080/hello/api/hello/Payara
```

You should consider mapping your local Maven repository into the Maven Container during build to avoid downloading your project dependencies each time.
# Make Blog

## Build Image
```
mvn clean package -Dmaven.test.skip=true
```

## Push Image
```
mvn clean deploy -Dmaven.test.skip=true

OR

docker push mbiostudyregistry.azurecr.io/blog:{version}
```
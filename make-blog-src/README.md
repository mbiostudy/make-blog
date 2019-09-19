# Make Blog

## Build Image
```
mvn clean package -Dmaven.test.skip=true
```

## Push Image
```
mvn clean deploy -Dmaven.test.skip=true

OR

docker push 40.76.74.42:5000/blog:{version}
```
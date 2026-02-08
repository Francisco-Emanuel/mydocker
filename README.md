# MyDocker
## Aprendendo a mexer com docker
##### imagem de quarkus


# DEV
```bash
docker build --target development -t teste_docker -f Dockerfile.full ./teste_docker
```
##### depois:
```bash
docker run --rm -it \                                                              
  -v $(pwd)/teste_docker:/app \
  -p 8080:8080 \
  teste_docker
```

# PROD
```bash
docker build -t teste_docker -f Dockerfile.multistage ./teste_docker   
```
##### depois:
```bash
 docker run --rm -p "8080:8080" -it teste_docker 
```

## Ta confuso demais, vou refazer o "Dockerfile.full" para simplificar o modo dev, e fazer de forma correta o compose.yaml
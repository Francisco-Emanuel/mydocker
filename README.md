# MyDocker
## Aprendendo a mexer com docker
##### imagem de quarkus


# DEV
```bash
docker build -t teste_docker_dev -f Dockerfile.dev ./teste_docker
```
##### depois:
```bash
docker run --rm -it \                                                              
  -v $(pwd)/teste_docker:/app \
  -p 8080:8080 \
  teste_docker_dev
```

# PROD
```bash
docker build -t teste_docker -f Dockerfile.multistage ./teste_docker   
```
##### depois:
```bash
 docker run --rm -p "8080:8080" -it teste_docker 
```


##### Ta confuso demais, vou refazer o "Dockerfile.full" para simplificar o modo dev, e fazer de forma correta o compose.yaml

###### Renomeei o "Dockerfile.full" para "Dockerfile.old" e criei o "Dockerfile.dev" para modo dev, não é o ideal ainda eu acho, mas funciona, porcamente mas funciona. Os próximos passos seriam os listados abaixo.

- [x] Dockerfile.dev
- [] docker-compose.yaml
- [x] Postgres
- [] mudar imagem para eclipse/temurin
- [x] tirar quarkus-cli
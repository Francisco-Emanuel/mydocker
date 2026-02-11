# 🚀 [Nome do Projeto]

![GitHub repo size](https://img.shields.io/github/repo-size/Francisco-Emanuel/mydocker?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/Francisco-Emanuel/mydocker?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/Francisco-Emanuel/mydocker?style=for-the-badge)
![Bitbucket open issues](https://img.shields.io/bitbucket/issues/Francisco-Emanuel/mydocker?style=for-the-badge)
![Bitbucket open pull requests](https://img.shields.io/bitbucket/pr-raw/Francisco-Emanuel/mydocker?style=for-the-badge)

<img src="https://jhooq.com/wp-content/uploads/2020/03/Screenshot-2020-03-26-at-16.31.25.png" alt="Exemplo do Projeto" width="100%">

> Projeto para aprender a mexer com docker, contêm um uma simples aplicação quarkus.

---

## ☕ Sobre o Projeto

Pequeno projeto de estudo para aprendizado em docker, foi criado uma imagem e container contendo uma aplicação quarkus e um DB Postgres

---

## 🛠️ Tecnologias Utilizadas

O projeto foi desenvolvido utilizando as seguintes tecnologias:

* **[Java 21](https://openjdk.org/)**
* **[Quarkus](https://quarkus.io/)** - O framework Java Supersônico e Subatômico
* **[PostgreSQL](https://www.postgresql.org/)** - Banco de dados relacional
* **[Docker](https://www.docker.com/)** - Containerização
* **[Docker Compose](https://docs.docker.com/compose/)** - Orquestração de ambiente de desenvolvimento

---

## ⚙️ Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
[Git](https://git-scm.com), [Docker Desktop](https://www.docker.com/products/docker-desktop).
Além disso, é bom ter um editor para trabalhar com o código como [VSCode](https://code.visualstudio.com/).

---

## 🚀 Como Rodar

Siga o passo a passo abaixo para executar a aplicação em seu ambiente local.

### 1. Clonar o repositório

```bash
git clone [https://github.com/Francisco-Emanuel/](https://github.com/Francisco-Emanuel/)mydocker.git
cd mydocker
```

### 2. Configurar Variáveis de Ambiente
Se houver um arquivo de exemplo, renomeie-o:

```bash
cp .env.example .env
```

### 3. Subir o Ambiente (Docker)
Este projeto utiliza Docker Compose para subir a aplicação e o banco de dados simultaneamente.

```bash
# Sobe os containers e força o build da imagem
docker compose up --build
```

A aplicação estará disponível em:
* **API:** `http://localhost:8080`
* **Swagger UI:** `http://localhost:8080/q/swagger-ui`
* **Dev UI:** `http://localhost:8080/q/dev`

---

## 📂 Estrutura do Projeto

```
/src
  /main
    /docker       # Dockerfiles (JVM, Native, etc.)
    /java         # Código fonte da aplicação
    /resources    # Configurações (application.properties)
compose.yaml      # Orquestração dos containers
README.md         # Documentação do projeto
```

---

## 🛣️ Roadmap

- [x] Configuração inicial do ambiente Docker
- [x] Integração com Banco de Dados
- [ ] Criação dos Endpoints REST
- [ ] Implementação de Testes Unitários
- [ ] Deploy

---

## 🤝 Contribuição

Contribuições são muito bem-vindas!

1.  Faça um **fork** do projeto.
2.  Crie uma nova branch com as suas alterações: `git checkout -b my-feature`
3.  Salve as alterações e crie uma mensagem de commit contando o que você fez: `git commit -m "feature: My new feature"`
4.  Envie as suas alterações: `git push origin my-feature`
5.  Abra um **Pull Request**.

---

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

## 👨‍💻 Autor

<table style="border: none;">
  <tr>
    <td align="center" style="border: none;">
      <a href="https://github.com/Francisco-Emanuel">
        <img src="https://github.com/Francisco-Emanuel.png" width="100px;" alt="Foto de Francisco Emanuel"/><br>
        <sub><b>Francisco Emanuel</b></sub>
      </a>
    </td>
  </tr>
</table>

<p>Feito com 💜 por Francisco Emanuel 👋</p>


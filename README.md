# Projeto Cadastro Full Stack

Este é um projeto full-stack desenvolvido com *React* (frontend) e *Spring Boot* (backend). O objetivo é fornecer uma interface para cadastrar usuários e verificar se os dados foram inseridos com sucesso através de uma API.

## Tecnologias Utilizadas

- *Frontend:* React com Vite
- *Backend:* Spring Boot com H2 (banco de dados em memória)
- *Docker:* Para orquestrar os containers

## Pré-requisitos

Antes de começar, você precisa ter o Docker instalado em sua máquina. Se não tiver, você pode seguir a documentação oficial para [instalar o Docker](https://docs.docker.com/get-docker/).

## Como Rodar o Projeto

### Passo 1: Clonar o Repositório

Primeiro, clone o repositório para sua máquina local:

```bash
git clone https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git
cd SEU_REPOSITORIO
```

### Passo 2: Rodar os Containers com Docker Compose

Para rodar a aplicação, basta executar o comando a seguir, que irá construir e iniciar os containers para o backend e frontend:

```bash
docker-compose up --build
```

# Instruções para Rodar o Projeto

Este comando vai construir as imagens dos containers e iniciar os serviços definidos no arquivo docker-compose.yml. Ele irá executar:

- *Frontend*: A aplicação React será construída e estará disponível em http://localhost:5173.
- *Backend*: A API Spring Boot será executada e estará acessível em http://localhost:8080.

## Passo 3: Acessar o Frontend

Após os containers serem iniciados, abra seu navegador e acesse o frontend:

[http://localhost:5173](http://localhost:5173)

No frontend, você poderá preencher um formulário para cadastrar um novo usuário. Após o envio, os dados do usuário serão enviados para o backend.

## Passo 4: Verificar os Dados Cadastrados

Depois de cadastrar um usuário no frontend, você pode verificar se o cadastro foi inserido corretamente no banco de dados do backend. Para fazer isso, acesse o endpoint de usuários do backend:

[http://localhost:8080/usuarios](http://localhost:8080/usuarios)

Aqui você verá a lista de usuários que foram cadastrados, visualizando as informações que foram salvas no banco de dados em memória (H2).

## Estrutura do Projeto

A estrutura do projeto é dividida em duas partes principais:

### Backend (Spring Boot)

- */backend*: Contém o código do backend, incluindo a API REST que manipula os dados de usuários.
- A API está configurada para rodar no endereço http://localhost:8080 e usa o banco de dados H2 em memória.
- O backend possui endpoints para cadastrar e listar usuários.

### Frontend (React)

- */frontend*: Contém o código do frontend, que foi criado com React e Vite.
- O frontend é servido na porta 5173 e oferece uma interface para cadastrar usuários, que são salvos no banco de dados do backend.
- A comunicação entre o frontend e o backend é realizada via chamadas HTTP.

## Como Personalizar o Projeto

- Para alterar o banco de dados (atualmente configurado como H2 em memória), edite o arquivo application.properties dentro do diretório do backend e modifique as configurações de banco de dados.
- Para modificar o frontend, altere o código dentro da pasta frontend. Isso pode incluir mudanças no formulário de cadastro ou no estilo da página.

## Contribuição

Se você deseja contribuir com o projeto, faça um fork do repositório, crie uma branch com suas alterações e envie um pull request. Fique à vontade para sugerir melhorias ou corrigir erros.

## Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo LICENSE para mais detalhes.

### O que foi adicionado:

- *Passo 3 e Passo 4:* Explicação de como acessar o frontend e verificar os dados cadastrados no backend.
- *Estrutura do Projeto:* Detalhamento sobre o que cada pasta contém (backend e frontend).
- *Como Personalizar o Projeto:* Instruções para alterar o banco de dados e o frontend.
- *Contribuição e Licença:* Como contribuir para o projeto e a licença utilizada (MIT).

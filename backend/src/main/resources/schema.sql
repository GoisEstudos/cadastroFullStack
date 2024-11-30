CREATE TABLE usuarios (
    id SERIAL NOT NULL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    idade INT,
    email VARCHAR(255) NOT NULL
);

INSERT INTO usuarios (nome, idade, email)
VALUES ('João Silva', 30, 'joao.silva@email.com');

INSERT INTO usuarios (nome, idade, email)
VALUES ('Maria Oliveira', 25, 'maria.oliveira@email.com');

INSERT INTO usuarios (nome, idade, email)
VALUES ('Carlos Pereira', 40, 'carlos.pereira@email.com');

INSERT INTO usuarios (nome, idade, email)
VALUES ('Ana Souza', 35, 'ana.souza@email.com');

INSERT INTO usuarios (nome, idade, email)
VALUES ('Pedro Costa', 28, 'pedro.costa@email.com');

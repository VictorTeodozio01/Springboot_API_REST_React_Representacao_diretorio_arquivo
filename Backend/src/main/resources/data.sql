/*CREATE TABLE IF NOT EXISTS arquivo (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(255) NOT NULL,
  diretorio_id BIGINT
);

CREATE TABLE IF NOT EXISTS diretorio (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    parent_id BIGINT
);

-- Inserir Diretórios
INSERT INTO diretorio (nome, parent_id) VALUES ('dir1', NULL);
INSERT INTO diretorio (nome, parent_id) VALUES ('dir2', NULL);
INSERT INTO diretorio (nome, parent_id) VALUES ('subdir1', 2);

-- Inserir Arquivos
INSERT INTO arquivo (nome, diretorio_id) VALUES ('file1.txt', 1);
INSERT INTO arquivo (nome, diretorio_id) VALUES ('file2.txt', 1);
INSERT INTO arquivo (nome, diretorio_id) VALUES ('file3.txt', 3);
*/
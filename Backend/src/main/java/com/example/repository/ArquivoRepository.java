package com.example.repository;

import com.example.model.Arquivo;
import com.example.model.Diretorio;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArquivoRepository extends JpaRepository<Arquivo, Long> {
    boolean existsByNomeAndDiretorio(String nome, Diretorio diretorio);
}

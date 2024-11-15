package com.example.repository;

import com.example.model.Diretorio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiretorioRepository extends JpaRepository<Diretorio, Long> {
    Diretorio findByNomeAndDiretorioPai(String nome, Diretorio diretorioPai);
}

package com.example.service;

import com.example.model.Diretorio;
import com.example.repository.DiretorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiretorioService {

    @Autowired
    private DiretorioRepository diretorioRepository;

    public List<Diretorio> listarTodos() {
        return diretorioRepository.findAll();
    }

    public Diretorio criarDiretorio(Diretorio diretorio) {

        // Verifica se o diretório já existe no mesmo nível
        Diretorio existente = diretorioRepository.findByNomeAndDiretorioPai(diretorio.getNome(),
                diretorio.getDiretorioPai());
        if (existente != null) {
            throw new RuntimeException("Diretório já existe no mesmo nível.");
        }

        return diretorioRepository.save(diretorio);
    }

    public Diretorio atualizarDiretorio(Long id, Diretorio diretorio) {
        diretorio.setId(id);
        return diretorioRepository.save(diretorio);
    }

    public void deletarDiretorio(Long id) {
        diretorioRepository.deleteById(id);
    }
}

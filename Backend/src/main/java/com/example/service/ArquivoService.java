package com.example.service;

import com.example.model.Arquivo;
import com.example.model.Diretorio;
import com.example.repository.ArquivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ArquivoService {

    @Autowired
    private ArquivoRepository arquivoRepository;

    public List<Arquivo> listarTodos() {
        return arquivoRepository.findAll();
    }

    public Arquivo criarArquivo(@RequestBody Arquivo arquivo) {
        // Verifica se o arquivo já existe no diretório
        Diretorio diretorio = arquivo.getDiretorio();
        if (diretorio.getArquivos().stream().anyMatch(a -> a.getNome().equals(arquivo.getNome()))) {
            throw new IllegalArgumentException("Arquivo já existe no diretório.");
        }

        return arquivoRepository.save(arquivo);
    }

    public void deletarArquivo(Long id) {
        arquivoRepository.deleteById(id);
    }

    public boolean existsByNomeAndDiretorio(String nome, Diretorio diretorio) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsByNomeAndDiretorio'");
    }
}

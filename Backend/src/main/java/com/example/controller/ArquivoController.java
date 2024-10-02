package com.example.controller;

import com.example.model.Arquivo;
import com.example.service.ArquivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/arquivos")
public class ArquivoController {

    @Autowired
    private ArquivoService arquivoService;

    @GetMapping
    public List<Arquivo> listarArquivos() {
        return arquivoService.listarTodos();
    }

    @PostMapping
    public Arquivo criarArquivo(@RequestBody Arquivo arquivo) {
        if (arquivoService.existsByNomeAndDiretorio(arquivo.getNome(), arquivo.getDiretorio())) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Arquivo já existe no diretório.");
        }

        return arquivoService.criarArquivo(arquivo);
    }

    @DeleteMapping("/{id}")
    public void deletarArquivo(@PathVariable Long id) {
        arquivoService.deletarArquivo(id);
    }
}

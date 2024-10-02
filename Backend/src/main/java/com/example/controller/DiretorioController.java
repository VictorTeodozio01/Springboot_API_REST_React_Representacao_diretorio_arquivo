package com.example.controller;

import com.example.model.Diretorio;
import com.example.service.DiretorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/diretorios")
public class DiretorioController {

    @Autowired
    private DiretorioService diretorioService;

    @GetMapping
    public List<Diretorio> listarDiretorios() {
        return diretorioService.listarTodos();
    }

    @PostMapping
    public Diretorio criarDiretorio(@RequestBody Diretorio diretorio) {
        return diretorioService.criarDiretorio(diretorio);
    }

    @PutMapping("/{id}")
    public Diretorio atualizarDiretorio(@PathVariable Long id, @RequestBody Diretorio diretorio) {
        return diretorioService.atualizarDiretorio(id, diretorio);
    }

    @DeleteMapping("/{id}")
    public void deletarDiretorio(@PathVariable Long id) {
        diretorioService.deletarDiretorio(id);
    }
}

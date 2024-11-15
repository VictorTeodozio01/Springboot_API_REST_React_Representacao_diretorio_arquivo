package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "nome", "diretorio_id" }) })
public class Arquivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "diretorio_id", nullable = false)
    private Diretorio diretorio;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Diretorio getDiretorio() {
        return diretorio;
    }

    public void setDiretorio(Diretorio diretorio) {
        this.diretorio = diretorio;
    }
}

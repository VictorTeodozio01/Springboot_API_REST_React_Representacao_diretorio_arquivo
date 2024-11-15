package com.example.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "diretorio", uniqueConstraints = @UniqueConstraint(columnNames = { "nome", "parent_id" }))
public class Diretorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "parent_id", nullable = true)
    private Diretorio diretorioPai;

    @JsonManagedReference
    @JsonIgnore
    @OneToMany(mappedBy = "diretorioPai", cascade = CascadeType.ALL)
    private List<Diretorio> subdiretorios = new ArrayList<>();

    @JsonManagedReference
    @OneToMany(mappedBy = "diretorio", cascade = CascadeType.ALL)
    private List<Arquivo> arquivos = new ArrayList<>();

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

    public Diretorio getDiretorioPai() {
        return diretorioPai;
    }

    public void setDiretorioPai(Diretorio diretorioPai) {
        this.diretorioPai = diretorioPai;
    }

    public List<Diretorio> getSubdiretorios() {
        return subdiretorios;
    }

    public void setSubdiretorios(List<Diretorio> subdiretorios) {
        this.subdiretorios = subdiretorios;
    }

    public List<Arquivo> getArquivos() {
        return arquivos;
    }

    public void setArquivos(List<Arquivo> arquivos) {
        this.arquivos = arquivos;
    }
}

package com.example.aula.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;

public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Marca do veiculo é obrigatório.")
    private String marca;

    @NotBlank(message = "Modelo do veiculo é obrigatório.")
    private String modelo;

    @NotBlank(message = "Ano do veiculo é obrigatório.")
    private String ano;

    @ManyToOne
    private Usuario usuario;

    public Carro() {
    }

    public Carro(String marca, String modelo, String ano) {
        this.id= id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}


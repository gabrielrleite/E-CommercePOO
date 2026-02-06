package com.gabrielrleite.ecommerce;

public class Cliente {
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCliente() {
        return "Nome: " + this.nome + ", Email: " + this.email;
    }
    
}

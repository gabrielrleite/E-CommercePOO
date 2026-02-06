package com.gabrielrleite.ecommerce;

public class Produto {

    private int id;
    private String nome;
    private double preco;


    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return this.id;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        if(preco > 0) {
            this.preco = preco;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public double calcularPreco(int quantidade) {
        return this.preco * quantidade;
    }

    public double calcularFrete(int distancia) {
        if (distancia <= 50) {
            return 10.0;
        } else if (distancia <= 200) {
            return 20.0;
        } else {
            return 50.0;
        }
    }    
}

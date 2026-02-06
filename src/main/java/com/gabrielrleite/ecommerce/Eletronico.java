package com.gabrielrleite.ecommerce;

public class Eletronico extends Produto {
    private String marca;
    private String modelo;

    public Eletronico(int id, String nome, double preco, String marca, String modelo) {
        super(id, nome, preco);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }
    
    @Override
    public double calcularPreco(int quantidade) {
        double precoBase = super.calcularPreco(quantidade);
        if (precoBase > 1000) {
            precoBase *= 0.95;
        }
        return precoBase;
    }

    @Override
    public double calcularFrete(int distancia) {
        if (distancia <= 100) {
            return 15.0;
        } else {
            return 30.0;
        }
    }
}

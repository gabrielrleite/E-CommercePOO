package com.gabrielrleite.ecommerce;

public class Livro extends Produto {
    private String autor;
    private int numeroDePaginas;

    public Livro(int id, String nome, double preco, String autor, int numeroDePaginas) {
        super(id, nome, preco);
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getAutor() {
        return this.autor;
    }
    
    public int getNumeroDePaginas() {
        return this.numeroDePaginas;
    }

    @Override
    public double calcularPreco(int quantidade) {
        double precoBase = super.calcularPreco(quantidade);
        if (this.numeroDePaginas > 100) {
            precoBase *= 0.9;
        }
        return precoBase;
    }

    @Override
    public double calcularFrete(int distancia) {
        return 5.0;
    }
    
}

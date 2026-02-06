package com.gabrielrleite.ecommerce;

public class Pedido {
    private int numeroPedido;
    private Cliente cliente;
    private Produto produto;
    private int quantidade;

    public Pedido(int numeroPedido, Cliente cliente, Produto produto, int quantidade) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularValorTotal() {
        return produto.calcularPreco(quantidade);
    }

    public int getNumeroPedido() {
        return this.numeroPedido;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        }
    }

    public String getDetalhesPedido() {
        return "Pedido Nº: " + this.numeroPedido + "\n" +
               "Cliente: " + this.cliente.getCliente() + "\n" +
               "Produto: " + this.produto.getNome() + "\n" +
               "Quantidade: " + this.quantidade + "\n" +
               "Valor Total: R$ " + String.format("%.2f", calcularValorTotal());
    }
}

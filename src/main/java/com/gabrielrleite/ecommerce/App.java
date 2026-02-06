package com.gabrielrleite.ecommerce;

public class App {
    public static void main(String[] args) {
        // Cria clientes e produtos
        Cliente cliente1 = new Cliente("Maria", "maria@example.com");
        Cliente cliente2 = new Cliente("Joao", "joao@example.com");

        Livro livro = new Livro(1, "Aprendendo Java", 120.0, "Autor X", 250);
        Eletronico celular = new Eletronico(2, "Smartphone", 1500.0, "MarcaY", "X1000");

        // Pedido com livro
        Pedido pedido1 = new Pedido(1001, cliente1, livro, 2);
        System.out.println("== Pedido 1 ==");
        System.out.println(pedido1.getDetalhesPedido());
        System.out.println("Frete (livro, 30km): R$ " + String.format("%.2f", pedido1.getProduto().calcularFrete(30)));
        System.out.println();

        // Pedido com eletrônico
        Pedido pedido2 = new Pedido(1002, cliente2, celular, 1);
        System.out.println("== Pedido 2 ==");
        System.out.println(pedido2.getDetalhesPedido());
        System.out.println("Frete (eletrônico, 150km): R$ " + String.format("%.2f", pedido2.getProduto().calcularFrete(150)));
        System.out.println();

        // Execução Setters
        pedido1.setProduto(celular);
        pedido1.setQuantidade(2);
        pedido1.setCliente(cliente2);
        System.out.println("== Pedido 1 (após alterações) ==");
        System.out.println(pedido1.getDetalhesPedido());
        System.out.println("Frete (após alteração, 80km): R$ " + String.format("%.2f", pedido1.getProduto().calcularFrete(80)));
    }
}

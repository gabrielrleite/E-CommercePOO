Gabriel Rodrigues Leite - Paradigmas de Progamação

# E-commerce

Projeto de E-commerce simples em Java

## Estrutura do Projeto

```
ECommercePOO/  
├── src/  
│   ├── main/  
│   │   ├── java/   
│   │   │   └── com/gabrielrleite/ecommerce/  
│   │   │       ├── App.java  
│   │   │       ├── Cliente.java  
│   │   │       ├── Produto.java  
│   │   │       ├── Livro.java  
│   │   │       ├── Eletronico.java  
│   │   │       └── Pedido.java  
│   │   └── resources/  
│   └── test/  
│       ├── java/  
│       └── resources/  
├── pom.xml  
└── README.md  
```

## Pré-requisitos

- Java 11 ou superior (o projeto foi testado com JDK 17)
- Maven 3.6.0 ou superior

## Como Compilar

```bash
mvn -DskipTests package
```

## Como Executar

Compile e execute a classe `App` gerada em `target/classes`:

```bash
mvn -DskipTests package
java -cp target/classes com.gabrielrleite.ecommerce.App
```

Isso imprimirá exemplos de `Pedido`, demonstrando getters/setters, sobrescrita
de métodos (`calcularPreco`, `calcularFrete`) e comportamento dinâmico.

## O que foi implementado

- Abstração: existem 5 classes com múltiplos atributos e métodos.
- Encapsulamento: atributos `private` com getters e setters públicos (ex.: `Pedido`).
- Herança: `Livro` e `Eletronico` estendem `Produto` (classe mãe).
- Polimorfismo: `calcularPreco(int)` e `calcularFrete(int)` são sobrescritos em
  `Livro` e `Eletronico` com comportamentos diferentes.

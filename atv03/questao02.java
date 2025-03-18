package atv03;

import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int categoria;
        do {
            System.out.println("Informe a categoria do produto (1, 2, 3): ");
            categoria = scanner.nextInt();
            if (categoria < 1 || categoria > 3) {
                System.out.println("Categoria inválida! Digite 1, 2 ou 3.");
            }
        } while (categoria < 1 || categoria > 3);
        
        // Preço do produto
        double precoProduto;
        do {
            System.out.print("Informe o preço do produto: R$ ");
            precoProduto = scanner.nextDouble();
            if (precoProduto <= 0) {
                System.out.println("O preço deve ser maior que zero.");
            }
        } while (precoProduto <= 0);
        
        // Quantidade comprada
        int quantidade;
        do {
            System.out.print("Informe a quantidade comprada: ");
            quantidade = scanner.nextInt();
            if (quantidade <= 0) {
                System.out.println("A quantidade deve ser maior que zero.");
            }
        } while (quantidade <= 0);

        // Desconto da categoria
        double descontoCategoria = 0;
        switch (categoria) {
            case 1:
                descontoCategoria = 10;
                break;
            case 2:
                descontoCategoria = 15;
                break;
            case 3:
                descontoCategoria = 8;
                break;
        }

        // Desconto da quantidade
        double descontoQuantidade = 0;
        if (quantidade <= 2) {
            descontoQuantidade = 2;
        } else if (quantidade <= 10) {
            descontoQuantidade = 5;
        } else {
            descontoQuantidade = 10;
        }

        // Cálculo do desconto total
        double descontoTotal = descontoCategoria + descontoQuantidade;
        double precoComDesconto = precoProduto * (1 - (descontoTotal / 100));
        double valorTotalCompra = precoComDesconto * quantidade;
        double valorOriginalCompra = precoProduto * quantidade;
        double economia = valorOriginalCompra - valorTotalCompra;

        // Resultados
        System.out.printf("Preço original do produto: R$ ", precoProduto);
        System.out.printf("Desconto aplicado: ", descontoTotal);
        System.out.printf("Novo preço do produto: R$ ", precoComDesconto);
        System.out.printf("Valor total da compra: R$ ", valorTotalCompra);
        System.out.printf("Valor economizado: R$ ", economia);

        scanner.close();
    }
}
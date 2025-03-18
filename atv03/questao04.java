package atv03;

import java.util.Scanner;

public class questao04 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Entrada dos valores
        System.out.print("Informe o valor inicial da progressão aritmética: ");
        int valorInicial = scanner.nextInt();

        System.out.print("Informe o fator de incremento: ");
        int incremento = scanner.nextInt();

        System.out.print("Informe a quantidade de termos da série: ");
        int quantidadeTermos = scanner.nextInt();

        // Validação da quantidade de termos
        while (quantidadeTermos <= 0) {
            System.out.print("A quantidade de termos deve ser maior que zero. Informe novamente: ");
            quantidadeTermos = scanner.nextInt();
        }

        // Progressão aritmética
        System.out.print("Série gerada: ");
        for (int i = 0; i < quantidadeTermos; i++) {
            int termo = valorInicial + (i * incremento);
            System.out.print(termo);
            if (i < quantidadeTermos - 1) {
                System.out.print(", ");
            }
        }
        
        System.out.println(); // Quebra de linha 
        scanner.close();
    }
}

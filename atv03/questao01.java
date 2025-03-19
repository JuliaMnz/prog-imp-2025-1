package atv03;

import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da conta: ");
        double valorConta = scanner.nextDouble();

        System.out.print("Informe o percentual da multa: (Exemplo: 2 para 2%)");
        double valorMulta = scanner.nextDouble();

        System.out.print("Informe o percentual dos juros: (Exemplo: 5 para 5%)");
        double valorJuros = scanner.nextDouble();

        System.out.print("Informe a quantidade de dias em atraso: ");
        int diasAtraso = scanner.nextInt();

        if (diasAtraso >= 45) {
            System.out.println("O cálculo da conta não pode ser realizado. A conta está atrasada há 45 dias ou mais.");
        } else {
            // Cálculo da multa
            double multa = valorConta * (valorMulta / 100);
            //Cálculo dos juros
            double jurosDiarios = (valorJuros / 100) / 30;
            double juros = valorConta * jurosDiarios * diasAtraso;
            //Cálculo do valor final da conta
            double valorFinal = valorConta + multa + juros;
            // Resultado final
            System.out.println("Valor inicial da conta: R$ " + valorConta);
            System.out.println("Multa aplicada: R$ " + multa);
            System.out.println("Juros aplicados: R$ " + juros);
            System.out.println("Valor final da conta: R$ " + valorFinal);
        
            scanner.close();

        }
    }
}
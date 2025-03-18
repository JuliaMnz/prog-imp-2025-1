package atv03;

import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        char continuar;
        int idadeMaisPesada = 0;
        double pesoMaisPesado = 0;
        int somaPesosHomens = 0;
        int contadorHomensMenos30 = 0;
        int totalMulheres = 0;
        int mulheresMenos50kg = 0;
        
        do {
            System.out.print("Informe o sexo (M/F): ");
            char sexo = scanner.next().toUpperCase().charAt(0);
            
            while (sexo != 'M' && sexo != 'F') {
                System.out.print("Entrada inválida! Informe o sexo (M/F): ");
                sexo = scanner.next().toUpperCase().charAt(0);
            }
            
            System.out.print("Informe a idade: ");
            int idade = scanner.nextInt();
            
            while (idade <= 0) {
                System.out.print("Idade inválida! Informe um valor positivo: ");
                idade = scanner.nextInt();
            }
            
            System.out.print("Informe o peso (kg): ");
            double peso = scanner.nextDouble();
            
            while (peso <= 0) {
                System.out.print("Peso inválido! Informe um valor positivo: ");
                peso = scanner.nextDouble();
            }
            
            // Verificando a pessoa mais pesada
            if (peso >= pesoMaisPesado) {
                pesoMaisPesado = peso;
                idadeMaisPesada = idade;
            }
            
            // Média de peso dos homens com menos de 30 anos
            if (sexo == 'M' && idade < 30) {
                somaPesosHomens += peso;
                contadorHomensMenos30++;
            }
            
            // Percentual de mulheres com menos de 50 kg
            if (sexo == 'F') {
                totalMulheres++;
                if (peso < 50) {
                    mulheresMenos50kg++;
                }
            }
            
            System.out.print("Deseja continuar? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);
        } while (continuar == 'S');
        
        // Cálculo da média de peso dos homens com menos de 30 anos
        double mediaPesoHomens = (contadorHomensMenos30 > 0) ? (double) somaPesosHomens / contadorHomensMenos30 : 0;
        
        // Cálculo do percentual de mulheres com menos de 50 kg
        double percentualMulheres = (totalMulheres > 0) ? ((double) mulheresMenos50kg / totalMulheres) * 100 : 0;
        
        // Exibição dos resultados
        System.out.println("\nResultados:");
        System.out.println("Idade da pessoa mais pesada: " + idadeMaisPesada);
        System.out.printf("Média de peso dos homens com menos de 30 anos: %.2f kg%n", mediaPesoHomens);
        System.out.printf("Percentual de mulheres com menos de 50 kg: %.2f%%%n", percentualMulheres);
        
        scanner.close();
    }
}

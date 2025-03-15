import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de notas: ");
        int capacidade = input.nextInt();
        
        double[] notas = new double[capacidade];
        
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = input.nextDouble();
        }

        System.out.println("\nNotas digitadas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println((i + 1) + "ª nota = " + notas[i]);
        }

        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.println("\nMédia da turma: " + media);

    }
}
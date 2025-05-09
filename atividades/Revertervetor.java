import java.util.Scanner;

public class Revertervetor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];

        System.out.println("\nDigite os valores do vetor: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("vetor [" + i + "] = ");
            vetor[i] = scanner.nextInt();
        }

        reverterVetor(vetor);
    }

    public static void reverterVetor(int[] vetor) {
        int i = 0;
        int j = vetor.length - 1;

        System.out.print("\nVetor original: ");
        for (int indice = 0; indice < vetor.length; indice++) {
            System.out.print(vetor[indice] + " ");
        }

        while (i < j) {
            int temp = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = temp;
            i++;
            j--;
        }

        System.out.print("\nVetor invertido: ");
        for (int numeroVetor : vetor) {
            System.out.print(numeroVetor + " ");
        }
    }
}
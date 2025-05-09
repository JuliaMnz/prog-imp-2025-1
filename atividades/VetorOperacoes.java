import java.util.Scanner;

public class VetorOperacoes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72};

        System.out.print("Digite um número para buscar: ");
        int alvo = input.nextInt();

        int inicio = 0;
        int fim = numeros.length - 1;
        int meio;
        boolean encontrado = false;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;

            if (numeros[meio] == alvo) {
                System.out.println("Número encontrado na posição: " + meio);
                encontrado = true;
                break;
            } else if (numeros[meio] < alvo) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado no vetor.");
        }
    }
}

import java.util.Scanner;

public class VetorO {

    public static void preencherVetor(int[] v, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            v[i] = scanner.nextInt();
        }
    }

    public static void imprimirVetor(int[] v, int n) {
        System.out.print("{ ");
        for (int i = 0; i < n; i++) {
            System.out.print(v[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }

    public static void ordenar(int[] v, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
    }

    public static void imprimirMaiorImpar(int[] v, int n) {
        int maiorImpar = Integer.MIN_VALUE;
        boolean existeImpar = false;

        for (int i = 0; i < n; i++) {
            if (v[i] % 2 != 0 && v[i] > maiorImpar) {
                maiorImpar = v[i];
                existeImpar = true;
            }
        }

        if (existeImpar) {
            System.out.println("Maior número ímpar: " + maiorImpar);
        } else {
            System.out.println("Não há números ímpares no vetor");
        }
    }

    public static void criarParesImpares(int[] v, int n, int[] pares, int[] impares) {
        int idxP = 0, idxI = 0;

        for (int i = 0; i < n; i++) {
            if (v[i] % 2 == 0) {
                pares[idxP++] = v[i];
            } else {
                impares[idxI++] = v[i];
            }
        }

        while (idxP < n) {
            pares[idxP++] = -1;
        }
        while (idxI < n) {
            impares[idxI++] = -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = scanner.nextInt();

        int[] vetor = new int[n];
        int[] pares = new int[n];
        int[] impares = new int[n];

        preencherVetor(vetor, n);

        System.out.print("Vetor original: ");
        imprimirVetor(vetor, n);

        ordenar(vetor, n);
        System.out.print("Vetor ordenado: ");
        imprimirVetor(vetor, n);

        imprimirMaiorImpar(vetor, n);

        criarParesImpares(vetor, n, pares, impares);
        System.out.print("Vetor de pares: ");
        imprimirVetor(pares, n);
        System.out.print("Vetor de ímpares: ");
        imprimirVetor(impares, n);
    }
}

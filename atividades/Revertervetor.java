public class Revertervetor {

    public static void reverterVetor(int [] v) {
        int[] vetor = {1, 2, 3, 4, 5};
        int i = 0;
        int j = vetor.length - 1;

        System.out.print("Vetor original: ");
        for (i = 0; i < vetor.length; i++) {
            int numeroVetor = vetor[i];
            System.out.println(numeroVetor + " ");
        }

        while (i < j) {
            int temp = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = temp;
            i++;
            j--;
        }
        System.out.println("Vetor invertido: ");
        for (int numeroVetor : vetor) {
            System.out.print(numeroVetor + " ");
        }

    }
}
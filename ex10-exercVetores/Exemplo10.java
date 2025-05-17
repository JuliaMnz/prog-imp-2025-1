public class Exemplo10 {
    public static void main(String[] args) {
        int [] vetor = new int[] { 8, 13, 21, 34, 55, 89 };
        imprimirVetor(vetor, vetor.length);
        reverter(vetor, vetor.length);
        imprimirVetor(vetor, vetor.length);
        reverter(vetor, vetor.length);
        if validarFibonacci(vetor, vetor.length) {
            
        }
    }

    public static void reverter(int[]  v, int n) {
        for (int i = 0; i < n / 2; i+= 1) {
            int aux = v[i];
            v[i] = v[n - 1 - i];
            v[n - 1 - i] = aux;
        }
    }

    public static void imprimirVetor(int[] v, int n) {
        for (int i = 0; i < n / 2; i += 1) {
            int aux = v[i];
            v[i] = v[n - 1 - i];
            v[n - 1 - i] = aux;
        }
    }

    public static boolean validarFibonacci(int [] v, int n) {
        int penult = 0, ultima = 1, atual;
        for (int i = 0; i < n; i += 1) {
            atual = penult + ultima;
            System.out.print(atual + " ");

            penult = ultima;
            ultima = atual;
        }

    }
}
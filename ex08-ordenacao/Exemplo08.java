public class Exemplo08 {
    public static void insercaoDireta(double[] v, int n) {
        int j;
        double chave;
        for (int i = 1; i <= n - 1; i++) {
            chave = v [i];
            j = i - 1;
            while (j >= 0 && v[j] > chave) {
                v[j + 1] = v[j];
                j = j - 1;
            }
            v[j + 1] = chave;
        }
    }   
}

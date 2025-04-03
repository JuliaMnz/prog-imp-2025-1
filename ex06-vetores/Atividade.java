import java.util.Random;

public class Atividade {
    public static void main(String[] args) {
        int[] numerosAleatorios = new int[1000];
        gerarNumerosAleatorios(numerosAleatorios);
        
        System.out.println("Números aleatórios sem repetição:");
        for (int numero : numerosAleatorios) {
            System.out.println(numero);
        }
        
        int[] numerosOrdenados = new int[1000];
        preencherOrdenado(numerosOrdenados);
        embaralharVetor(numerosOrdenados);
        
        System.out.println("\nNúmeros embaralhados:");
        for (int numero : numerosOrdenados) {
            System.out.println(numero);
        }
    }

    public static void gerarNumerosAleatorios(int[] v) {
        Random random = new Random();
        int count = 0;
        while (count < v.length) {
            int numero = random.nextInt(1000) + 1;
            if (busca(v, count, numero) == -1) {
                v[count] = numero;
                count++;
            }
        }
    }

    public static int busca(int[] v, int tam, int x) {
        for (int i = 0; i < tam; i++) {
            if (v[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void preencherOrdenado(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = i + 1;
        }
    }

    public static void embaralharVetor(int[] v) {
        Random random = new Random();
        for (int i = 0; i < v.length; i++) {
            int indiceAleatorio = random.nextInt(1000); // Gera um índice aleatório entre 0 e 999
            int temp = v[i];
            v[i] = v[indiceAleatorio];
            v[indiceAleatorio] = temp;
        }
    }
}

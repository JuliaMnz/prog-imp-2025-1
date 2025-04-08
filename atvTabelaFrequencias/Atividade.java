package atvTabelaFrequencias;

import java.util.Random;

public class Atividade {
    public static void main(String[] args) {
        int[] vetor = new int[200];
        Random rand = new Random();

        for (int i = 0; i < vetor.length; i ++) {
            vetor[i] = rand.nextInt(20) + 1;
        }

        System.out.println("=== Frequência - Versão 1 ===");
        System.out.println("Valor | Frequência");

        for (int valor = 1; valor<= 20; valor++) {
            int contador = 0;
            for (int i = 0; i < vetor.length; i++) {
                if(vetor[i] == valor) {
                    contador++;
                }
            }
            System.out.println(valor + " | " + contador);
        }

        int[] frequencia = new int[20];
        for(int i = 0; i < vetor.length; i++) {
            frequencia[vetor[i] - 1]++;
        }

        System.out.println("\n=== Frequência - Versão 2 ===");
        System.out.println("Valor | Frequência");
        for (int i = 0; i < frequencia.length; i++) {
            System.out.println((i + 1) + " | " + frequencia[i]);
        }
    }
}

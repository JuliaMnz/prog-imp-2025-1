package ex07;

import java.util.Random;

public class Exemplo07 {
    public static final int TAM = 1000;
    public static Random geradorAleat = new Random();

    public static void main(String[] args) {
        int[] numeros = new int[TAM];
        preencherAleatorio2(numeros);
    }

    public static void preencherAleatorio1(int[] v) {
        int qtdGeracoes = 0;
        for (int i = 0; i < v.length; i += 1) {

        }
    }

    public static void preencherAleatorio2(int[] v) {
        int pos;
        int aux;
        for (int i = 0; i < v.length; i += 1) {
            v[i] = i + 1;
        }
        for (int i = 0; i < v.length; i += 1) {
            pos = geradorAleat.nextInt(TAM);
            aux = v[1];
            v[i];
        }
    }
}
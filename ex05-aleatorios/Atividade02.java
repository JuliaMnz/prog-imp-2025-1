import java.util.Random;

public class Atividade02 {
    public static void main(String[] args) {

    Random geradorAleat = new Random();
    // Pontuação dos jogadores
    int pontos1 = 0;
    int pontos2 = 0;

    // Loop para as rodadas e gerador dos números dos jogadores
    for (int rodada = 1; rodada <= 10; rodada++) {
        int jogador1 = geradorAleat.nextInt(6) + 1;
        int jogador2 = geradorAleat.nextInt(6) + 1;
    
        System.out.println("Rodada " + rodada + ": O jogador 1: " + jogador1 + " - O jogador 2: " + jogador2);

        if (jogador1 > jogador2) {
            pontos1++;
            System.out.println("Jogador 1 ganhou!\n");
        } else if (jogador2 > jogador1) {
            pontos2++;
            System.out.println("Jogador 2 ganhou!\n");
        } else {
            System.out.println("Empatou!\n");
        }
    
    }

    // Mostrar a pontuação final
    System.out.println("=== RESULTADO FINAL ===");
    if (pontos1 > pontos2) {
        System.out.println("Jogador 1 ganhou por " + pontos1 + " x " + pontos2 + "!");
    } else if (pontos2 > pontos1) {
        System.out.println("Jogador 2 ganhou por " + pontos2 + " x " + pontos1 + "!");
    } else {
        System.out.println("Empate no jogo " + pontos1 + " x " + pontos2 + "!");
    }

}

}

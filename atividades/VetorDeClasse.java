import java.util.Scanner;

public class VetorDeClasse {
    public static final int TAM = 10;
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[TAM];
        Aluno[] aprovados = new Aluno[TAM];
        Aluno[] reprovados = new Aluno[TAM];
        int qtdAprovados = 0;
        int qtdReprovados = 0;

        for (int i = 0; i < alunos.length; i += 1) {
            System.out.println("\n======= DIGITAÇÃO DOS DADOS DOS ALUNO " + (i + 1) + " =======");
            alunos[i] = new Aluno();
            lerAluno(alunos[i]);

            if (alunos[i].media >= 5.0) {
                aprovados[qtdAprovados] = alunos[i];
                qtdAprovados++;
            } else {
                reprovados[qtdReprovados] = alunos[i];
                qtdReprovados++;
            }
        }

        System.out.println("\n\n======= IMPRESSÃO DOS ALUNOS APROVADOS =======");
        for (int i = 0; i < qtdAprovados; i++) {
        imprimirAluno(aprovados[i]);
        }

        System.out.println("\n\n======= IMPRESSÃO DOS ALUNOS REPROVADOS =======");
        for (int i = 0; i < qtdReprovados; i++) {
        imprimirAluno(reprovados[i]);
        }
    }

    public static void lerAluno(Aluno a) {
    System.out.print("Digite o nome do aluno: ");
    a.nome = input.nextLine();
    System.out.print("Digite o número da matrícula: ");
    a.matricula = input.nextInt();
    System.out.print("Digite a média final do aluno: ");
    a.media = input.nextDouble();
    input.nextLine();
    }

    public static void imprimirAluno(Aluno a) {
        System.out.printf("Nome: %s, Matrícula: %d, Média: %.1f\n",
            a.nome, a.matricula, a.media);
    }
}

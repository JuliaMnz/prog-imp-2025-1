import java.util.Scanner;

public class Atividade01 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int peso, altura;
        System.out.print("Digite sua altura: ");
        altura = input.nextInt();
        System.out.println("Digite seu peso:");
        peso = input.nextInt();

        int imc = peso/ (altura * altura);

        if(imc > 18.5) {
            System.out.println("Você está abaixo do peso normal!");
        } else if (imc < 25) {
            System.out.println("Você está no peso normal!");
        } else if (imc )

    }
    
}

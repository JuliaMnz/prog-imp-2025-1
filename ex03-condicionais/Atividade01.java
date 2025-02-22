import java.util.Scanner;

public class Atividade01 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double peso, altura;
        System.out.print("Digite sua altura em metros: ");
        altura = input.nextDouble();
        System.out.print("Digite seu peso em kg:");
        peso = input.nextDouble();

        double imc = peso/ (altura * altura);

        if(imc < 18.5) {
            System.out.println("Você está abaixo do peso normal!");
        } else if (imc < 25) {
            System.out.println("Você está no peso normal!");
        } else if (imc < 30) {
            System.out.println("Você está com excesso de peso!");
        } else if (imc < 35) {
            System.out.println("Você está com obesidade classe 1!");
        } else if (imc < 40) {
            System.out.println("Você está com obesidade classe 2!");
        } else {
            System.out.println("Você está com obesidade clase 3!");
        }
        
        System.out.println("Seu IMC é: " + imc);
    }
    
}

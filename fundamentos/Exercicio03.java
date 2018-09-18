package fundamentos;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu peso:");
        double peso = scanner.nextDouble();

        System.out.println("Informe sua altura:");
        double altura = scanner.nextDouble();

        double resultado = peso / (altura * altura);

        System.out.println("Seu IMC é: " + resultado);

        scanner.close();
    }
}

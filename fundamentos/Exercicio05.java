package fundamentos;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor da base:");
        double base = scanner.nextDouble();

        System.out.println("Informe o valor da altura:");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.print("A área do triângulo é: " + area);

        scanner.close();
    }

}


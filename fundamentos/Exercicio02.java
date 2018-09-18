package fundamentos;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua temperatura em °F");
        double f = scanner.nextDouble();
        double c = (f - 32) / 1.8;

        System.out.println("Temperatura convertida em Celsius é: " +  c);

        scanner.close();
    }
}

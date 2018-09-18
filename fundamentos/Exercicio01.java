package fundamentos;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua temperatura em °C");
        double c = scanner.nextDouble();
        double f = (c * 1.8) + 32;

        System.out.println("Temperatura convertida em Fahrenheit é: " +  f);

        scanner.close();
    }
}

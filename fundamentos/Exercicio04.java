package fundamentos;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = scanner.nextDouble();

        double quadrado = Math.pow(valor, 2);
        double cubo = Math.pow(valor, 3);

        System.out.println("O seu valor ao quadrado é: " + quadrado + "\nO seu valor ao cubo é: " + cubo);

        scanner.close();
    }
}

package fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {
    public static void main(String[] args) {

        // sem conversão
        String resposta1 = JOptionPane.showInputDialog("Qual a nota 1?");
        String resposta2 = JOptionPane.showInputDialog("Qual a nota 2?");

        System.out.println(resposta1 + resposta2);

        // Com conversao
        double nota1 = Double.parseDouble(resposta1);
        double nota2 = Double.parseDouble(resposta2);
        double total = (nota1 + nota2) / 2;

        System.out.println(total);
    }
}

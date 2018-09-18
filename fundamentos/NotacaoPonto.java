package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Olá, é uma mensagem teste".toUpperCase().replace("TESTE", "oficial").concat("!");
        System.out.println(s);
    }
}

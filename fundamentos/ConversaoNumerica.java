package fundamentos;

public class ConversaoNumerica {

    public static void main(String[] args) {

        // exemplo 1 - conversao explicita
        float f = (float) 7.08;
        System.out.println(f);

        // exemplo 2 - conversao explicita
        double d1 = (int) 7.9;
        System.out.println(d1);

        // exemplo 3 - conversao implicita
        int i = 'a';
        System.out.println(i);

        // exemplo 4 - conversao implicita
        double d2 = 1234;
        System.out.println(d2);

    }
}

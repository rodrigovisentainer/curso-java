package fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args) {

        // tipos primitivos boolano
        boolean b1 = false;
        boolean b2 = true;
        System.out.printf("%b, %b\n", b1, b2);

        // tipos primitivos character
        char c1 = 'a';
        char c2 = '+';
        char c3 = '\u0030';
        System.out.printf("%c,%c,%c\n", c1,c2,c3 );

        // tipos primitivos inteiros
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        System.out.printf("%d,%d,%d,%d\n", b, s, i, l);
    }
}

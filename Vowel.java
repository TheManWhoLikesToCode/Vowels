import java.util.Scanner;

public class Vowel_1 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        String input;

        System.out.println("***************************************");
        System.out.println("Please input a word: ");

        Scanner in = new Scanner(System.in);
        input = in.next();
        char[] ch = new char[input.length()];


            for( int i = 0; i < ch.length; i++ )
            {
                ch[i] = input.charAt(i);
            }

            for( int i = 0; i < ch.length; i++);
            {
                
            }

    }
}
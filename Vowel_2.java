//Jaydin Freeman 

import java.util.Scanner;

public class Vowel_2 {

    public static void main(String[] args) {

        String input;
        int vowel = 0;

        // Ask User For String
        System.out.println("Please enter in a single word: ");
        Scanner in = new Scanner(System.in);
        input = in.next();
        in.close();

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            String temp = letter + "";

            if("aeiouy".indexOf(letter + "") != -1) {
                vowel++;
            }
        }
        System.out.println("The number of vowels in your string is: " + vowel);

    }
}
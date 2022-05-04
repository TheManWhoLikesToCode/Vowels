//Jaydin Freeman 

import java.util.Scanner;

public class Vowel {

    public static void main(String[] args) {

        String input;
        int vowel = 0;

        // Ask User For String
        System.out.println("Please enter in a single word: ");
        Scanner in = new Scanner(System.in);
        input = in.next();
        in.close();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a') {
                vowel += 1;
            }

            if (input.charAt(i) == 'e') {
                vowel += 1;
            }

            if (input.charAt(i) == 'i') {
                vowel += 1;
            }

            if (input.charAt(i) == 'o') {
                vowel += 1;
            }

            if (input.charAt(i) == 'u') {
                vowel += 1;
            }

            if (input.charAt(i) == 'y') {
                vowel += 1;
            }
        }
        System.out.println("The number of vowels in your string is: " + vowel);

    }
}
/* Ask the user to input a word then the program checks and outputs the following: characters,
vowels, consonants, digits, and spaces.
 */

import java.util.Scanner;


public class wAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        int characters = word.length();
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        for (int i = 0; i < word.length(); i++) {

            char character = word.charAt(i);

            if (character == 'a' || character == 'e' ||
                    character == 'i' || character == 'o' ||
                    character == 'u' || character == 'A' ||
                    character == 'E' || character == 'I' ||
                    character == 'O' || character == 'U') {

                vowels++;
            } else if (Character.isLetter(character)) {

                consonants++;
            } else if (Character.isDigit(character)) {

                digits++;
            } else if (character == ' ') {

                spaces++;
            }
        }
        System.out.println("Characters: " + characters);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);

        input.close();


    }
}

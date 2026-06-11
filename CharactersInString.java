package placement;

import java.util.Scanner;

public class CharactersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int digits = 0;
        int alphabets = 0;
        int specialChars = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isLetter(ch)) {
                alphabets++;
            } else {
                specialChars++;
            }
        }
        System.out.println("Alphabets: " + alphabets);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChars);
         sc.close();
    }
}

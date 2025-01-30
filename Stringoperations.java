import java.util.Scanner;

public class Stringoperations {
        public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = Scanner.nextLine();
        String uppercaseString = input.toUpperCase();
        System.out.println("Uppercase String: " + uppercaseString);
        int length = input.length();
        System.out.println("Length of the string: " + length);
        System.out.print("Enter the character to be replaced: ");
        char oldChar = Scanner.next().charAt(0);
        System.out.print("Enter the new character: ");
        char newChar = Scanner.next().charAt(0);
        String replacedString = input.replace(oldChar, newChar);
        System.out.println("String after replacement: " + replacedString);
        System.out.print("Enter the starting index for the substring: ");
        int startIndex = Scanner.nextInt();
        System.out.print("Enter the ending index for the substring: ");
        int endIndex = Scanner.nextInt();
        String substring = input.substring(startIndex, endIndex);
        System.out.println("Extracted Substring: " + substring);
        Scanner.close();
    }
}

package MethodsEx;

import java.util.Scanner;
public class CharactersInRange_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char char1 = scanner.nextLine().charAt(0);
        char char2 = scanner.nextLine().charAt(0);

        charRange(char1, char2);
    }

    public static void charRange(char char1, char char2) {
        if (char1 < char2) {
            for (int i = char1 + 1; i < char2; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = char2 + 1; i < char1; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}


package MethodsEx;

import java.util.Scanner;

public class VowelsCount_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        word = word.toLowerCase();
        vowelCounter(word);
    }

    public static void vowelCounter(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            // check if char[i] is vowel
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e'
                    || word.charAt(i) == 'i'
                    || word.charAt(i) == 'o'
                    || word.charAt(i) == 'u') {
                // count increments if there is vowel in
                // char[i]
                count++;
            }
        }
        System.out.println(count);
    }
}

package DataTypesLapExercise;

import java.util.Scanner;

public class AsciiTable_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int asciiValue = start; asciiValue <= end; asciiValue++) {
            System.out.print((char) asciiValue + " ");
        }
    }
}

package DataTypesLab;

import java.util.Scanner;

public class CharsToString_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);
        char thirdSymbol = scanner.nextLine().charAt(0);
       // System.out.printf("" + firstSymbol + secondSymbol + thirdSymbol);

        System.out.printf("%c%c%c", firstSymbol, secondSymbol, thirdSymbol);
    }
}

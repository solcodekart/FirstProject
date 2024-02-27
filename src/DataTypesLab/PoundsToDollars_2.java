package DataTypesLab;

import java.util.Scanner;

public class PoundsToDollars_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double britishPounds = Double.parseDouble(scanner.nextLine());
        System.out.printf("%.3f", britishPounds*1.36 );
    }
}

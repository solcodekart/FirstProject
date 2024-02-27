package DataTypesLab;

import java.util.Scanner;

public class ConvertMtoKm_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double meters = Double.parseDouble(scanner.nextLine());
        System.out.printf("%.2f", meters/1000 );
    }
}

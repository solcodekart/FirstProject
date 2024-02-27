package DataTypesLapExercise;

import java.util.Scanner;

public class SumChars_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            char symbol = scanner.nextLine().charAt(0);
            sum += (int) symbol;
        }

        System.out.println("The sum equals: " + sum);
    }
}

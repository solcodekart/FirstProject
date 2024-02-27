package BasicsOverview;

import java.util.Scanner;

public class MultiplicationTable_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            int finalNumber = number * multiplier;
             System.out.println(number + " X " + multiplier + " = " + finalNumber);
        }
    }
}

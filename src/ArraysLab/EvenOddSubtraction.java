package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumEven = 0;
        int sumOdd = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sumEven += number;
            }
        }
        for (int number : numbers) {
            if (number % 2 != 0) {
                sumOdd += number;
            }
        }
        System.out.print(sumEven - sumOdd);
    }
}

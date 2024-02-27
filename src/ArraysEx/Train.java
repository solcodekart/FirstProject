package ArraysEx;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            numbers[i] = people;
        }
        int sum = 0;

        for (int number : numbers) {
            System.out.print(number + " ");
            sum += number;
        }

        System.out.println();
        System.out.println(sum);
    }
}

package DataTypesLapExercise;

import java.util.Scanner;

public class Waterflow_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int count = 1; count <= n; count++) {
            int liters = Integer.parseInt(scanner.nextLine());
            sum += liters;
            if (sum > 255) {
                System.out.println("Insufficient capacity!");
                sum -= liters;
            }
        }
        System.out.println(sum);

    }
}

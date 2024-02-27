package MethodsLab;

import java.util.Scanner;

public class Grades_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double n = Double.parseDouble(scanner.nextLine());
        grades(n);
    }

    public static void grades(Double number) {
        if (number >= 2 && number <= 2.99) {
            System.out.println("Fail");
        } else if (number >= 3 && number <= 3.49) {
            System.out.println("Poor");
        } else if (number >= 3.50 && number <= 4.49) {
            System.out.println("Good");
        } else if (number >= 4.50 && number <= 5.49) {
            System.out.println("Very good");
        } else {
            System.out.println("Excellent");
        }
    }
}

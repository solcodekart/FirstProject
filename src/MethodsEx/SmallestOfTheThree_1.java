package MethodsEx;

import java.util.Scanner;

public class SmallestOfTheThree_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        biggerNumber(firstNumber,secondNumber, thirdNumber);
    }

    public static void biggerNumber(int firstNumber, int secondNumber, int thirdNumber ) {
        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            System.out.print(firstNumber);
        } else if (secondNumber < firstNumber && secondNumber < thirdNumber) {
            System.out.print(secondNumber);
        } else {
            System.out.print(thirdNumber);
        }
    }
}
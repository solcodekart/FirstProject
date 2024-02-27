package ArraysEx;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        String[] firstArray = new String[n];
        String[] secondArray = new String[n];

        for (int row = 1; row <= n; row++) {
            String [] currentRowElements = scanner.nextLine().split(" ");
            String firstElement = currentRowElements[0];
            String secondElement = currentRowElements[1];


            if (row % 2 != 0) {
                firstArray[row-1] = firstElement;
                secondArray[row-1] = secondElement;
            } else {
                firstArray[row-1] = secondElement;
                secondArray[row-1] = firstElement;
            }
        }
        for (String el : firstArray) {
            System.out.print(el + " ");
        }
        System.out.println();
        for (String el : secondArray) {
            System.out.print(el + " ");
        }
    }
}

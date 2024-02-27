package MethodsLab;

import java.util.Scanner;

public class RectangleArea_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        int area = calculateArea(length,width);
        System.out.println(area);
    }

    public static int calculateArea(int length, int width) {
         return length*width;
    }
}

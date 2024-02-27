package BasicsOverviewExcercise;

import java.util.Scanner;

public class Vacation_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double number = Double.parseDouble(scanner.nextLine());
        String group = scanner.nextLine();
        String day = scanner.nextLine();
        switch (group) {
            case "Students":
                if (day.equals("Friday")) {
                    if (number >= 30){
                        System.out.printf("Total price: %.2f", number*8.45 - number*8.45*0.15);
                    } else {
                        System.out.printf("Total price: %.2f", number*8.45);
                    }
                } else if (day.equals("Saturday")) {
                    if (number >= 30) {
                        System.out.printf("Total price: %.2f", (number * 9.80 - number * 9.80 * 0.15));
                    } else {
                        System.out.printf("Total price: %.2f", number * 9.80);
                    }
                } else {
                    if (number >= 30) {
                        System.out.printf("Total price: %.2f", (number * 10.46 - number * 10.46 * 0.15));
                    } else {
                        System.out.printf("Total price: %.2f", number * 10.46);
                    }
                }
                break;
            case "Business":
                if (day.equals("Friday")) {
                    if (number >= 100){
                        System.out.printf("Total price: %.2f", ((number-10)*10.90));
                    } else {
                        System.out.printf("Total price: %.2f", number*10.90);
                    }
                } else if (day.equals("Saturday")) {
                    if (number >= 100) {
                        System.out.printf("Total price: %.2f", ((number-10)*15.60));
                    } else {
                        System.out.printf("Total price: %.2f", number * 15.60);
                    }
                } else {
                    if (number >= 100) {
                        System.out.printf("Total price: %.2f", (number-10)*16);
                    } else {
                        System.out.printf("Total price: %.2f", number * 16);
                    }
                }
                break;
            case "Regular":
                if (day.equals("Friday")) {
                    if (number >= 10 && number <= 20){
                        System.out.printf("Total price: %.2f", (number*15 - number*15*0.05));
                    } else {
                        System.out.printf("Total price: %.2f", number*15);
                    }
                } else if (day.equals("Saturday")) {
                    if (number >= 10 && number <= 20) {
                        System.out.printf("Total price: %.2f", (number*20 - number*20*0.05));
                    } else {
                        System.out.printf("Total price: %.2f", number * 20);
                    }
                } else {
                    if (number >= 10 && number <= 20) {
                        System.out.printf("Total price: %.2f", (number*22.50 - number*22.50*0.05));
                    } else {
                        System.out.printf("Total price: %.2f ", number * 22.50);
                    }
                }
                break;
        }
    }
}

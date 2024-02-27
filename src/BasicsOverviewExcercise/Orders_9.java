package BasicsOverviewExcercise;

import java.util.Scanner;

public class Orders_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int orders = Integer.parseInt(scanner.nextLine());
        double money = 0;

        for (int order = 1; order <= orders; order++) {
            Double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsules = Integer.parseInt(scanner.nextLine());
            double totalPrice = ((days * capsules) * pricePerCapsule);

            System.out.printf("The price for the coffee is: $%.2f\n", totalPrice);
            money += totalPrice;
        }
        System.out.printf("Total: $%.2f", money);
    }
}

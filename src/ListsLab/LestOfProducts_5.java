package ListsLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LestOfProducts_5 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int countProducts = Integer.parseInt(scanner.nextLine());
    List<String> products = new ArrayList<>();

        for (int i = 1; i <= countProducts; i++) {
            String productName = scanner.nextLine();
            products.add(productName);
        }
        Collections.sort(products);
        int number = 1;
        for(String product: products) {
            System.out.println(number + "." + product);
            number++;
        }
    }
}

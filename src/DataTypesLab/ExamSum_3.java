package DataTypesLab;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExamSum_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal sum =new BigDecimal(0);
        for (int count = 1; count <= n; count++) {
            BigDecimal number = new BigDecimal(scanner.nextLine());
            sum=sum.add(number);

        }
        System.out.println(sum);
    }
}

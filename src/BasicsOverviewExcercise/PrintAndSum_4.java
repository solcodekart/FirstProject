package BasicsOverviewExcercise;

import java.util.Scanner;

public class PrintAndSum_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber= Integer.parseInt(scanner.nextLine());
        int endNumber= Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int count = startNumber; count <= endNumber; count++) {
            System.out.print(count + " ");
            sum+=count;
        }
        System.out.println("\n" +
                "Sum: " + sum);
    }
}

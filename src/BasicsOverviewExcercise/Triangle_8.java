package BasicsOverviewExcercise;

import java.util.Scanner;

public class Triangle_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());


        for (int row = 1; row <= n; row++) {
            for (int number = 1; number <= row; number++) {
                System.out.print(row + " ");
            }
            System.out.println();

        }
    }
}

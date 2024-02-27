package ArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")) {

            if (command.contains("swap")) {
                int firstIndex = Integer.parseInt(command.split(" ")[1]);
                int secondIndex = Integer.parseInt(command.split(" ")[2]);
                int fisrtIndexNumber = numbers[firstIndex];
                int secondIndexNumber = numbers[secondIndex];

                numbers[firstIndex] = secondIndexNumber;
                numbers[secondIndex] = fisrtIndexNumber;

            } else if (command.contains("multiply")) {
                int firstIndex = Integer.parseInt(command.split(" ")[1]);
                int secondIndex = Integer.parseInt(command.split(" ")[2]);
                int fisrtIndexNumber = numbers[firstIndex];
                int secondIndexNumber = numbers[secondIndex];
                int product = fisrtIndexNumber * secondIndexNumber;
                numbers[firstIndex] = product;

            } else {
                for (int position = 0; position <= numbers.length - 1; position++) {
                    numbers[position]--;
                }
            }
            command = scanner.nextLine();
        }

        System.out.println(Arrays.toString(numbers).replace("[","").replace("]", ""));
    }
}

package ListsLab;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegatives_6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                            .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> positiveNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number > 0) {
                positiveNumbers.add(number);
            }
        }

        Collections.reverse(positiveNumbers); // reverse the order

        if (positiveNumbers.isEmpty()) {
            System.out.println("empty");
        } else {
            for (int number : positiveNumbers) {
                System.out.print(number + " ");
            }
        }
    }
}

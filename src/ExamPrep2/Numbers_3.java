package ExamPrep2;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt).collect(Collectors.toList());
        double sum = 0;
        for (int number : numbers ) {
            sum += number;
        }
        double average = sum / numbers.size();

        List<Integer> greaterElements = new ArrayList<>();
        for (int number : numbers) {
            if (number > average) {
                greaterElements.add(number);
            }
        }
        Collections.sort(greaterElements);
        Collections.reverse(greaterElements);

        if(greaterElements.size() == 0) {
            System.out.println("No");
        } else {
            if (greaterElements.size() < 5) {
                for (int number : greaterElements) {
                    System.out.print(number + " ");
                }
            } else {
                List<Integer> firstFiveNumber = greaterElements.subList(0, 5);
                for (int number : firstFiveNumber) {
                    System.out.print(number + " ");
                }
            }
        }
    }
}

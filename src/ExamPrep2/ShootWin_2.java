package ExamPrep2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootWin_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        String[] inputTargets = scanner.nextLine().split(" ");
        for (String target : inputTargets) {
            numbers.add(Integer.parseInt(target));
        }
//        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
//                                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        int count = 0;

        while(!input.equals("End")) {
            int shotTarget = Integer.parseInt(scanner.nextLine());
            if(shotTarget >= 0 && shotTarget <= numbers.size() - 1) {
                int valueShotTarget = numbers.get(shotTarget);
                    for (int index = 0; index <= numbers.size(); index++) {
                        int currentTarget = numbers.get(index);
                            if (currentTarget != -1 && index != shotTarget) {
                                if ( currentTarget > valueShotTarget) {
                                    currentTarget -= valueShotTarget;
                                } else {
                                    currentTarget += valueShotTarget;
                                }
                                numbers.set(index, currentTarget);
                        }
                    }
                numbers.set(shotTarget, -1);
                count++;
            }
            input = scanner.nextLine();
        }
        System.out.print("Shot targets: " + count + " -> ");
        for (int target : numbers) {
            System.out.print(target + " ");
        }
    }
}

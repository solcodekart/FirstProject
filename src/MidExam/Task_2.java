package MidExam;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!command.equals("Finish")) {
            String [] commandParts = command.split(" ");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Add":
                    int numberToAdd = Integer.parseInt(commandParts[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(commandParts[1]);
                    numbers.remove(Integer.valueOf(numberToRemove));
                    break;
                case "Replace":
                    int valueToReplace = Integer.parseInt(commandParts[1]);
                    int replacement = Integer.parseInt(commandParts[2]);
                    int index = numbers.indexOf(valueToReplace);
                    if (index != -1) {
                        numbers.set(index, replacement);
                    }
                    break;
                case "Collapse":
                    int collapseNumber = Integer.parseInt(commandParts[1]);
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) < collapseNumber) {
                            numbers.remove(i);
                            i--; // Adjust the index after removal
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for(int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

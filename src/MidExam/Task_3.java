package MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] books = scanner.nextLine().split("&");
        List<String> shelf = new ArrayList<>();
        for (String book : books) {
            shelf.add(book);
        }

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            String[] tokens = input.split("\\s*\\|\\s*");
            String command = tokens[0];

            switch (command) {
                case "Add Book":
                    String bookToAdd = tokens[1];
                    if (!shelf.contains(bookToAdd)) {
                        shelf.add(0, bookToAdd);
                    }
                    break;
                case "Take Book":
                    String bookToTake = tokens[1];
                    shelf.remove(bookToTake);
                    break;
                case "Swap Books":
                    String book1 = tokens[1];
                    String book2 = tokens[2];
                    int index1 = shelf.indexOf(book1);
                    int index2 = shelf.indexOf(book2);
                    if (index1 != -1 && index2 != -1) {
                        shelf.set(index1, book2);
                        shelf.set(index2, book1);
                    }
                    break;
                case "Insert Book":
                    String bookToInsert = tokens[1];
                    if (!shelf.contains(bookToInsert)) {
                        shelf.add(bookToInsert);
                    }
                    break;
                case "Check Book":
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < shelf.size()) {
                        System.out.println(shelf.get(index));
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", shelf));
    }
}

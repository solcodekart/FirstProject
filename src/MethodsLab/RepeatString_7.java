package MethodsLab;

import java.util.Scanner;

public class RepeatString_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textToRepeat = scanner.nextLine();
        int countRepeat = Integer.parseInt(scanner.nextLine());
        String finalText = buildText(textToRepeat, countRepeat);
        System.out.println(finalText);
    }

    public static String buildText (String textToRepeat, int countRepeat) {
        String builtText = "";

        for (int count = 1; count <= countRepeat; count++) {
            builtText += textToRepeat;
        }
        return builtText;
    }
}

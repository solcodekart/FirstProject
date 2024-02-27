package DataTypesLapExercise;

import java.util.Scanner;

public class BeerKegs_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kegsCount = Integer.parseInt(scanner.nextLine());
        String maxModel = "";
        double maxVolume = 0;

        for (int keg = 1; keg <= kegsCount; keg++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * height * radius * radius;

            if (volume > maxVolume) {
                maxModel = model;
                maxVolume = volume;
            }
        }
        System.out.print(maxModel);
    }
}


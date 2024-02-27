package MidExam;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short biscuitsPerDay = Short.parseShort(scanner.nextLine());
        short workersCount = Short.parseShort(scanner.nextLine());
        int totalBiscuitsProducedOtherCompany = Integer.parseInt(scanner.nextLine());

//        double productionOnThirdDay =  biscuitsPerDay * 0.75;
//        double myProductionPerMonth = biscuitsPerDay * workersCount * 20 + workersCount * productionOnThirdDay * 10;


        int totalProduction = 0;
        int days = 30;
        for (int day = 1; day <= 30; day++) {
            int dailyProduction = biscuitsPerDay * workersCount;
            if (day % 3 == 0) {
                dailyProduction = (int) (dailyProduction * 0.75);
            }
            totalProduction += dailyProduction;
        }

        System.out.printf("You have produced %d biscuits for the past month.\n", totalProduction);

        if (totalProduction > totalBiscuitsProducedOtherCompany) {
            double percDifference = ((double) (totalProduction - totalBiscuitsProducedOtherCompany) / (totalBiscuitsProducedOtherCompany)) * 100;System.out.printf("You produce %.2f percent more biscuits.", percDifference);
        } else {
            double percDifference = ((double) (totalBiscuitsProducedOtherCompany - totalProduction) / ( totalBiscuitsProducedOtherCompany)) * 100;
            System.out.printf("You produce %.2f percent less biscuits.", percDifference);
        }

    }
}

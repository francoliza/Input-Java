package learn.java.academy;

import java.util.Scanner;

public class InputCalculator {

    public InputCalculator() {

    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        boolean isAnInt = true;
        int number;
        int sum = 0;
        int counter = 0;
        double avg = 0;


        while (isAnInt) {
            isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                number = scanner.nextInt();
                sum += number;
                counter++;
                avg = (double) sum / (double) counter;
                avg = Math.round(avg);

            } else if (counter == 0) {
                System.out.println("SUM = 0 AVG = 0");
            } else {
                System.out.println("SUM = " + sum + " AVG = " + (long) avg);
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}

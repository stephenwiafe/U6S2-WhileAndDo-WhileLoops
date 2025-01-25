package partA.ex01;

import java.util.Scanner;

public class SquareRootWhile {
    public static String squareRoot(){
        String response = "";
        Scanner scanner = new Scanner(System.in);
        double number = -1;

        while (number < 0) {
            System.out.print("Type a non-negative integer: ");

            if (scanner.hasNextDouble()) {
                number = scanner.nextDouble();

                if (number < 0) {
                    System.out.println("Invalid number, try again:");
                }
            } else {
                System.out.println("Invalid input, please enter a numeric value:");
                scanner.next();
            }
        }
        double squareRoot = Math.sqrt(number);
        response = "The square root of " + number + " is " + String.format("%.3f", squareRoot);

        return response;
    }
    public static void main(String args[]) {
        String outputSquareRoot = squareRoot();
        System.out.println(outputSquareRoot);

    }
}

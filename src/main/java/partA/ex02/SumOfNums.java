package partA.ex02;

import java.util.Scanner;

public class SumOfNums {
    public static String sum(){
        String response ="";
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int ct = 0;

        do {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
            sum += num;
            ct++;
        } while (ct < 10);

        double sqrtOf11 = Math.sqrt(11);
        return (response = String.format("The square root of 11 is %.3f", sqrtOf11));
    }

    public static void main(String args[]) {
        String outputSum = sum();
        System.out.println(outputSum);
    }
}

package partB.ex02;

import java.util.Scanner;

public class WhileLoop2 {
    public static String whileLoopTwo(){
        String response = "";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number to count to: ");
        int stop = scanner.nextInt();

        int i = 0;
        while (i < stop) {
            response += "The Current Number is :" + i + "\n";
            i++;
        }

        response += "We are done";


        return response;
    }

    public static void main(String[] args) {
        String outputWhileLoopTwo = whileLoopTwo();
        System.out.println(outputWhileLoopTwo);

    }
}

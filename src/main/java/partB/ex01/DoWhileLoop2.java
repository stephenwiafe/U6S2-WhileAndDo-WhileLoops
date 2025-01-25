package partB.ex01;

public class DoWhileLoop2 {
    public static String doWhileLoopTwo(){
        String response = "";

        int i = 1;
        do {
            response += i + " ";
            i += 2;
        } while (i < 20);

        return response;
    }

    public static void main(String[] args) {
        String outputDoWhileTwo = doWhileLoopTwo();
        System.out.println(outputDoWhileTwo);
    }
}

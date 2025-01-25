package partB.ex01;

public class DoWhileLoop1 {
    public static String doWhileLoopOne(){
        String response = "";

        int[] num = {43, 55, 68, 91, 105};
        int i = 0;

        do {
            response += num[i] + "\n";
            i++;
        } while (i < num.length);

        return response;
    }

    public static void main(String[] args) {
        String outputDoWhileOne = doWhileLoopOne();
        System.out.println(outputDoWhileOne);
    }
}

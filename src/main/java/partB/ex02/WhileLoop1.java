package partB.ex02;

public class WhileLoop1 {
    public static String whileLoopOne(){
        String response = "";

        int i = 1;

        while (i <= 1000) {
            if (i % 2 == 0) {
                response += i + " is even\n";
            }
            i++;
        }
        return response;
    }

    public static void main(String[] args) {
        String outputWhileLoopOne = whileLoopOne();
        System.out.println(outputWhileLoopOne);
    }
}

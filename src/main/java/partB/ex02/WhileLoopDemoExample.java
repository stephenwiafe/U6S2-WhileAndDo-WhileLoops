package partB.ex02;

public class WhileLoopDemoExample {

    public static String whileLoop(){
        String response = "";

        int num = 0; // initialize num to 0
        response += ("Let's count to 10!"); //append the string to the beginning
        while(num > 10){  //if num is greater than look proceed with executing statement inside
            num = num + 1; //increment num by 1
            response += ("Number: " + num); // append the number to the string
        }
        response += ("We have counted to 10! Hurrah!"); // append an ending message

        return response; // return the response

    }
    public static void main(String[] args) {
        String outputWhileLoop = whileLoop();
        System.out.println(outputWhileLoop);
    }


}

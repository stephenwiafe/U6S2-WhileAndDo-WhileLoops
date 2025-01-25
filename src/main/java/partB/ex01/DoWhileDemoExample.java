package partB.ex01;

public class DoWhileDemoExample {
    public static String doWhile(){
        String response = ""; //initliaze response to an empty string

        int i=1;    //declare an int variable i and set it to 1
        do { //enter the loop
            if(i%2==1) //if the remainder is equal to the value 1
                response += (" "+i); // append it as part of the string
            i++;    //increment the i value
        }while(i<21); //if i value is not equal or greater than 21 run the loop again

        return response; //return the value
    }



    public static void main(String[] args) {
        String outputDoWhile = doWhile();
        System.out.println(outputDoWhile);
    }
}

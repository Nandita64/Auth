import java.io.IOException;
import java.util.Scanner;

public class NewClass {

    //set of inputs =aabbcdd
    //output=a2b2c1d2
    // aabbaa
    //output a2b2a2
    //abc
    //output a1b1c1
    public static void main(String args[])throws IOException {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the String");
       String input= scanner.nextLine();
       System.out.println("The result= "+StringValue(input));
    }
    public static String StringValue(String input){
        String result="";
        int count=1;
        for(int i=0;i<input.length();i++)
        {

            char character = input.charAt(i);
            if(character==input.charAt(i+1))
                count++;

            else {
                result = result + input.charAt(i) + count;
                count = 1;
            }
        }
        return result;
    }
}

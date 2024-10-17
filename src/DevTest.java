import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {

        String firstName = "";
        Scanner in = new Scanner(System.in);


        firstName = getNonZeroLenString(in, "Enter your first name");

        System.out.println("F name is " + firstName);

    }

    public static String getNonZeroLenString(Scanner pipe, String prompt){
        String retVal = "";

        while(retVal.isEmpty()){
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();

            if(retVal.isEmpty()){
                System.out.println("You must enter at least one character!");
            }

        }

        return retVal;
    }




}
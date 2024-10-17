import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {

        String firstName = "";
        Scanner in = new Scanner(System.in);
        int age = 0;

        //firstName = getNonZeroLenString(in, "Enter your first name");

        //System.out.println("F name is " + firstName);

        //age = getInt(in, "Enter your age");

        //System.out.println("You said your age is " + age);


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

    public static int getInt(Scanner pipe, String prompt){
        int retVal = 0;
        boolean done = false;
        String trash = "";

        while(!done){
            System.out.print(prompt + ": ");
            if(pipe.hasNextInt()){
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;

            } else {
                trash = pipe.nextLine();
                System.out.println("Enter a valid integer " + trash);
            }

        }

        return retVal;
    }
}
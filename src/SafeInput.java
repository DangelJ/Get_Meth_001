import java.util.Scanner;

public class SafeInput {

    /**
     * gets a string from the user using the console, and
     * it must be at least one character in length
     * @param pipe a scanner used to get the input
     * @param prompt the prompt that tells the user what to enter
     * @return a String of at least one character in length
     */

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

    /**
     * Gets an int value from the user at the console with no constraint
     * @param pipe a scanner used to get the input
     * @param prompt the prompt that tells the user what to enter
     * @return an int of any value
     */

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

//importing scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //psuedo code
        //class WristBand
        //	main()
        //		num age = 0
        //		num DRINKING_AGE = 21
        //		output “Enter your age:’
        //		input age
        //		if age >= DRINKING_AGE then
        //			output “You get a wrist band. Drink responsibly!”
        //		end if
        //	return
        //end class

        //declaring variables
        Scanner in = new Scanner(System.in);
        int age = 0;
        int DRINKING_AGE = 21;
        //output asking for user age
        System.out.println("Enter your age:");
        //input for user age
        age = in.nextInt();
        //clear buffer
        in.nextLine();
        //if statement that determines and outputs if user gets a wrist band or not

    }
}
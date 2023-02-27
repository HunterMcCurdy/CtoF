import java.util.Scanner;
public class CtoF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // declare variables
        int celsius = 0;
        int fahrenheit = 0;
        String trash = "";
        // declare loop
        boolean done = false;
        do
        {
            System.out.print("What is the degrees in Celsius?");
            // checks to see input
         if (in.hasNextInt())
            {
                celsius = in.nextInt();
                in.nextLine();
                // calculates C to F
                fahrenheit = celsius * 9/5 + 32;
                System.out.println("Your degrees in Celsius " + celsius + " is " + fahrenheit + " in fahrenheit");
                done = true;

            }
         else
         {
             trash = in.nextLine();
             System.out.println("You must enter an integer: " + trash);
         }
// ends loop
        } while (!done);













    }
}

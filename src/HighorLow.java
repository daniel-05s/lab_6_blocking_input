import java.util.Random;
import java.util.Scanner;

public class HighorLow
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        boolean done = false;
        int rndVal = gen.nextInt(10) + 1;
        int userGuess = 0;

        String trash = "";


        do {
            IO.print("Enter your guess [1-10]: ");


            if (in.hasNextInt()) {
                userGuess = in.nextInt();
                in.nextLine(); // Clear the newline from the buffer

                if (userGuess >= 1 && userGuess <= 10) // Guess is in valid range 1 - 10
                {

                    if (userGuess == rndVal)
                        IO.println("you guess the value correctly: " + rndVal);
                    else if (userGuess > rndVal)
                        IO.println(" Your Guess " + userGuess + " is greater than " + rndVal);
                    else
                        IO.println(" Your Guess " + userGuess + " is less than " + rndVal);
                    done = true;
                }
                else
                    IO.println("you must enter a valid guess value in the range [1-10]");
            }
            else // not an int
            {
                trash = in.nextLine();
                IO.println("you must enter a valid integer value not : " + trash);
                IO.println("try again");
            }

        } while (!done);
    }
}

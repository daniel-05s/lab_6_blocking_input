import java.util.Scanner;

public class GasMileage
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        double tankCapacity=0;
        double mpg = 0;
        double pricePerGallon = 0;
        double cost100 = 0;
        double totalMiles = 0;

        boolean done = false;
        String trash = "";


        do{

            IO.print("enter the tank capacity in gallons: ");

            if(in.hasNextDouble())
            {
                tankCapacity = in.nextDouble();
                in.nextLine();
                done = true;

            }
            else
            {
                trash = in.nextLine();
                IO.println("you must enter a valid tank capacity value not " + trash);

            }

        } while(!done);

        IO.println("the capacity is " + tankCapacity);


        done = false;

        do{

            IO.print("enter the miles per gallon: ");

            if(in.hasNextDouble())
            {
                mpg = in.nextDouble();
                in.nextLine();
                done = true;

            }
            else
            {
                trash = in.nextLine();
                IO.println("you must enter a valid mpg value not " + trash);

            }

        } while(!done);

        IO.println("the mpg is " + mpg);

        done = false;

        do{

            IO.print("enter the price per gallon: ");

            if(in.hasNextDouble())
            {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                done = true;

            }
            else
            {
                trash = in.nextLine();
                IO.println("you must enter a valid price per gallon value not " + trash);

            }

        } while(!done);

        IO.println("the price per gallon is " + pricePerGallon);

        // given size of tank, cost per gallon, and miles per gallon
        // cost to go 100 miles
        // 100 / mpg * price per gallon
        cost100 = 100 / mpg * pricePerGallon;

        totalMiles = tankCapacity * mpg;

        IO.println("the cost to go 100 miles is: " + cost100);
        IO.println("the total miles on a full tank is: " + totalMiles);

    }
}

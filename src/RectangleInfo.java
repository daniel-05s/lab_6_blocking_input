import java.util.Scanner;

public class RectangleInfo
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        double height = 0;
        double width = 0;
        double area = 0;
        double perimeter = 0;
        double hypotenuse = 0;
        String trash = "";
        boolean done = false;


        do{
            IO.print("enter the height: ");

            if (in.hasNextDouble())
            {
                height = in.nextDouble();
                done = true;

            }
            else
            {
                trash = in.nextLine();
                IO.println( "you must enter a valid height value not : " + trash);
                IO.println("try again");


            }

        }while(!done);

        IO.println("you said the height is " + height);

        done = false;

        do{
            IO.print("enter the width: ");

            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                done = true;

            }
            else
            {
                trash = in.nextLine();
                IO.println( "you must enter a valid width value not : " + trash);
                IO.println("try again");


            }

        }while(!done);

        IO.println("you said the width is " + width);

        area = height * width;
        perimeter = 2 * height + 2 * width;
        hypotenuse = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));

        IO.println("the area is " + area);
        IO.println("the perimeter is " + perimeter);
        IO.println("the hypotenuse is " + hypotenuse);



    }
}

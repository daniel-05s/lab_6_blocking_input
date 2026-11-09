//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main()
{
    Scanner in = new Scanner(System.in);

    double cVal = 0;
    double fVal = 0;
    boolean done = false;
    String trash = "";

    // F = C * 9.0/5 + 32

    do{
        IO.print("enter the C value: ");

        if (in.hasNextDouble())
        {
            cVal = in.nextDouble();
            fVal = cVal * 9.0 / 5 + 32;
            IO.println("the value " + cVal + " in celsius is: " + fVal + " in ferenheit");
            done = true;

        }
        else
        {
            trash = in.nextLine();
            IO.println( "you must enter a valid farenheit value not : " + trash);
            IO.println("try again");


        }

    }while(!done);

}

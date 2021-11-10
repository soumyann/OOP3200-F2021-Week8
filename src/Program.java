import java.util.Scanner;

/**
 * @author      Soumya Naarayanamandiram Narayananunni
 * @StudentID   100807129
 * @date        November 5,2021
 */


public class Program
{
    /**
     * Tjis function returns the square of the value parameter
     * @param value a floating point number to be squared
     * @return returns the square of value
     */

    //adding a new function that returns a float named square
    public static float square(float value)
    {
        return value * value;
    }

    /**
     * The entry point for our program
     * @param args an array of command line parameters
     */


    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        float valueToSquare = 5;
        float squaredValue=square(valueToSquare);

        // example of output
        System.out.println("The Squared value is: "+ squaredValue);

        // Step 1. for input we need to create a Scanner object
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter your name: ");

        // Step 2. Use the Scanner object to get the "next" line of data; in this case a String value
        String name = inputObject.nextLine();

        System.out.print("Enter your Age: ");
        int age= inputObject.nextInt();

        Person person = new Person(name,age);
        person.SaysHello();

    }
}

public class Program
{
    //adding a new function that returns a float named square
    public static float square(float value)
    {
        return value * value;
    }



    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        float valueToSquare = 5;
        float squaredValue=square(valueToSquare);
        System.out.println("The Squared value is: "+ squaredValue);

        Person person = new Person( "Soumya", 30);
        person.SaysHello();

    }
}

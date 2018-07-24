import java.util.Scanner;

public class MetricConversion
{
    public static void main(String args[])
    {
        double value;
        Scanner input = new Scanner(System.in);
        System.out.println("Please type in a value: ");
        value = input.nextDouble();
        convertValue(value);
    }

    public static void convertValue(double value)
    {
        final double INCH_TO_CM = 2.54;
        final double GALLON_TO_LITER = 3.7854;
        System.out.println(value + " inches is equal to " + (value*INCH_TO_CM) + " cm");
        System.out.println(value + " gallons is equal to " + (value*GALLON_TO_LITER) + " liters");
    }
}

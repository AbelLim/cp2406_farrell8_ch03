import java.util.Scanner;

public class Percentages2
{
    public static void main(String args[])
    {
        double a = 2.0;
        double b = 5.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        a = input.nextDouble();
        System.out.println("Please enter another number: ");
        b = input.nextDouble();
        computePercentage(a,b);
        computePercentage(b,a);
    }

    public static void computePercentage(double a, double b)
    {
        System.out.println(a + " is " + (a/b*100) + " percent of " + b + ".");
    }
}

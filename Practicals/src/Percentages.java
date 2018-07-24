public class Percentages
{
    public static void main(String args[])
    {
        double a = 2.0;
        double b = 5.0;

        computePercentage(a,b);
        computePercentage(b,a);
    }

    public static void computePercentage(double a, double b)
    {
        System.out.println(a + " is " + (a/b*100) + " percent of " + b + ".");
    }
}

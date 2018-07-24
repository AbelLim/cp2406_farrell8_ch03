public class NumbersDemo
{
    public static void main(String args[])
    {
        int a = 5;
        int b = 3;
        displayTwiceTheNumber(a);
        displayTwiceTheNumber(b);
        displayNumberPlusFive(a);
        displayNumberPlusFive(b);
        displayNumberSquared(a);
        displayNumberSquared(b);
    }

    public static void displayTwiceTheNumber(int num)
    {
        System.out.println("Twice of " + num + " is " + num*2);
    }

    public static void displayNumberPlusFive(int num)
    {
        System.out.println("Five plus " + num + " is " + num+5);
    }

    public static void displayNumberSquared(int num)
    {
        System.out.println(num + " squared is " + (int) Math.pow(num,2));
    }
}

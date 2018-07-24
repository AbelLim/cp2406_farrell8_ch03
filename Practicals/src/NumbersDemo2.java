import java.util.Scanner;

public class NumbersDemo2
{
    public static void main(String args[])
    {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = input.nextInt();
        System.out.println("Enter another number: ");
        b = input.nextInt();

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

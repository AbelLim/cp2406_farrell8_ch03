import java.util.Scanner;

public class Insurance
{
    public static void main(String args[])
    {
        int currentYear;
        int birthYear;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the current year: ");
        currentYear = input.nextInt();
        System.out.println("Please enter your birth year: ");
        birthYear = input.nextInt();
        calculatePremium(currentYear - birthYear);
    }

    public static void calculatePremium(int age)
    {
        int premium;
        premium = (age/10 + 15) * 20;
        System.out.println("Your premium is $" + premium);
    }
}

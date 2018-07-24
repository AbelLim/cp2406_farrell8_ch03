import java.util.Scanner;

public class CraftPricing
{
    public static void main(String args[])
    {
        String productName;
        double materialCost;
        double hoursWorked;
        double finalPricing;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your product's name: ");
        productName = input.next();
        System.out.println("Enter the cost of materials: ");
        materialCost = input.nextDouble();
        System.out.println("Enter the number of hours worked: ");
        hoursWorked = input.nextDouble();

        finalPricing = calculatePricing(materialCost, hoursWorked);
        System.out.println("The price for " + productName + " will be $" + finalPricing);
    }

    public static double calculatePricing(double cost, double hours)
    {
        double pricing = cost + 12 * hours + 7;
        return pricing;
    }
}

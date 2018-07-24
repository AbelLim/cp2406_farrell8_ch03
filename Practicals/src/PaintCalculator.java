import java.util.Scanner;

public class PaintCalculator
{
    public static void main(String args[])
    {
        double length;
        double width;
        double height;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the room: ");
        length = input.nextDouble();
        System.out.println("Enter the width of the room: ");
        width = input.nextDouble();
        System.out.println("Enter the height of the room: ");
        height = input.nextDouble();

       System.out.println("The paint will cost $" + calculatePrice(length, width, height));
    }

    public static double calculatePrice(double length, double width, double height)
    {
        final double PAINT_PRICE = 32;
        double totalArea = 2 * length * height + 2 * width * height;
        double paintRequired = calculatePaintRequired(totalArea);
        System.out.println("You will need " + paintRequired + " gallons of paint.");

        double totalPrice = paintRequired*PAINT_PRICE;
        return totalPrice;
    }

    public static double calculatePaintRequired(double area)
    {
        final double PAINT_AREA_PER_GALLON = 350;
        double paintRequired = area/PAINT_AREA_PER_GALLON;
        return paintRequired;
    }
}

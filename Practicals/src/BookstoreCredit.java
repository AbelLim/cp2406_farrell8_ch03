import java.util.Scanner;

public class BookstoreCredit
{
    public static void main(String args[])
    {
        String studentName;
        double studentGPA;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        studentName = input.nextLine();
        System.out.println("Please enter your GPA: ");
        studentGPA = input.nextDouble();
        displayCredit(studentName, studentGPA);
    }

    public static void displayCredit(String name, Double GPA)
    {
        System.out.println("Hi " + name + ", your GPA is " + GPA + ". You have been awarded $" + (GPA*10) + " in bookstore credits.");

    }
}

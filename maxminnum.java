import java.util.Scanner;
public class maxminnum 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) 
        {
            System.out.println(num1 + " is the maximum number.");
            System.out.println(num2 + " is the minimum number.");
        } 
        else if (num2 > num1) 
        {
            System.out.println(num2 + " is the maximum number.");
            System.out.println(num1 + " is the minimum number.");
        } 
        else 
        {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
    
}

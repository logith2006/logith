import java.util.Scanner;
public class mileagecalc 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting mileage: ");
        double startMileage = scanner.nextDouble();

        System.out.print("Enter ending mileage: ");
        double endMileage = scanner.nextDouble();

        if (endMileage >= startMileage) 
        {
            double distanceTraveled = endMileage - startMileage;
            System.out.printf("Distance traveled: %.2f miles%n", distanceTraveled);
        } 
        else 
        {
            System.out.println("Error: Ending mileage must be greater than or equal to starting mileage.");
        }

        scanner.close();
    }
    
}

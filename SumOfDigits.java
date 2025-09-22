import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        while (num != 0) {
            sum += num % 10; // get the last digit and add to sum
            num /= 10;       // remove the last digit
        }

        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}

import java.util.Scanner;

public class MagicNumber {
    
    
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int temp = num;

        
        while (temp > 9) {
            temp = sumOfDigits(temp);
        }

       
        if (temp == 1) {
            System.out.println("Magic Number");
        } else {
            System.out.println("Not Magic Number");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (isSpy(n)) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not Spy Number");
        }
    }

    
    private static boolean isSpy(int n) {
        int sum = 0, product = 1, temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        return sum == product;
    }
}

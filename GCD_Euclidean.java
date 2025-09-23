import java.util.Scanner;

public class GCD_Euclidean {
   
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        
        int result = gcd(num1, num2);

        System.out.println(result);

        sc.close();
    }
}

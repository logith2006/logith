import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLong()) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }

        long n = sc.nextLong();
        sc.close();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        System.out.println(collatzToString(n));
    }

    
    private static String collatzToString(long n) {
        StringBuilder sb = new StringBuilder();
        long cur = n;
        sb.append(cur);

        while (cur != 1) {
            if ((cur & 1) == 0) {          
                cur = cur / 2;
            } else {                        
                cur = 3 * cur + 1;
            }
            sb.append(", ").append(cur);
        }

        return sb.toString();
    }
}

import java.util.Scanner;

public class PrintDigitsLeftToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        String numStr = Integer.toString(num);
        
        for (int i = 0; i < numStr.length(); i++) {
            System.out.print(numStr.charAt(i) + " ");
        }
    }
}

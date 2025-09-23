import java.util.Scanner;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        System.out.print("Enter the digit to find: ");
        int digit = sc.nextInt();

        int firstPos = -1;
        int lastPos = -1;
        long temp = num;
        int position = 1; 
        String numStr = String.valueOf(num);

        
        for (int i = 0; i < numStr.length(); i++) {
            if (Character.getNumericValue(numStr.charAt(i)) == digit) {
                if (firstPos == -1) {
                    firstPos = i + 1; 
                }
                lastPos = i + 1;
            }
        }

        if (firstPos == -1) {
            System.out.println("Digit not found in the number.");
        } else {
            System.out.println("First = " + firstPos + ", Last = " + lastPos);
        }
    }
}

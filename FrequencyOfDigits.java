import java.util.Scanner;

public class FrequencyOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long num = sc.nextLong();
        
        int[] freq = new int[10]; 
        
        while (num > 0) {
            int digit = (int)(num % 10);
            freq[digit]++;
            num /= 10;
        }
        
        
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " → " + freq[i]);
            }
        }
        
        sc.close();
    }
}

import java.util.Scanner;

public class CenterDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int num = sc.nextInt();
        
        String str = String.valueOf(num);
        int len = str.length();
        
        if (len % 2 == 0) {
            
            System.out.println(-1);
        } else {
            
            int mid = len / 2; 
            System.out.println(str.charAt(mid));
        }
        
        sc.close();
    }
}

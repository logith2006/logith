import java.util.Scanner;

public class daymonthyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        if (isValidDate(day, month, year)) {
            System.out.println("The date " + day + "/" + month + "/" + year + " is valid.");
        } else {
            System.out.println("The date " + day + "/" + month + "/" + year + " is not valid.");
        }

        scanner.close();
    }

    
    public static boolean isValidDate(int day, int month, int year) {
        if (year < 1) return false;   
        if (month < 1 || month > 12) return false;  

        int[] daysInMonth = { 31, (isLeapYear(year) ? 29 : 28), 31, 30, 31, 30,
                              31, 31, 30, 31, 30, 31 };

        return day >= 1 && day <= daysInMonth[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}

import java.util.Scanner;
public class posnegzero{


public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int number=sc.nextInt();

    if(number>0)
    {
        System.out.println(number+" is positive");
    }
    else if(number<0)
    {
        System.out.println(number+" is negative");
    }
    else
    {
        System.out.println(number+" is zero");
    }
    sc.close();
    

}
}
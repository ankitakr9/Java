package Loops;
import java.util.Scanner;
public class ReverseNum {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        //print reverse of the no.
        // while(n>0)
        // {
        //     int lastdigit=n%10;
        //     System.out.print(lastdigit);
        //     n=n/10;

        // }
        // System.out.println( );
        // sc.close();
        //Reverse the given number
        int rev=0;
        while(n>0)
        {
            int lastDigit=n%10;
            rev=(rev*10)+lastDigit;
            n=n/10;

        }
        System.out.print("your Reversed No is: " +rev);
        sc.close();
        
        
    }
}

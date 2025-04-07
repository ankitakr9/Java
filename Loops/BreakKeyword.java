package Loops;
import java.util.*;
public class BreakKeyword {
    public static void main(String args[])
    {
        // int i;
        // for( i =1; i<=10; i++)
        // {
        //     if(i==8)
        //     break;
        
        //     System.out.println(i);
        // }
        // System.out.println("I am out of the loop");
        //Keep entering number till user enters a multiple of  10                                               
        Scanner sc= new Scanner(System.in);
        do{
            System.out.print("Enter your number:");
            int n= sc.nextInt();
            if(n%10==0)
            {
                break;
            }
            System.out.println("Number:" + n);
        }
        while(true);
        sc.close();

    }
    
}

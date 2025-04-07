package Loops;
import java.util.*;

public class PrintNumber {
    public static void main(String args[])
    {
    //print the no.
        // int counter=1;
        // while(counter<=50)
        // {
        //     System.out.println(counter);
        //     counter++;
        // }
        // System.out.println("Here is your Numbers...");
    //Print the no. 1 to N
        // Scanner sc= new Scanner(System.in);
        // int n= sc.nextInt();
        // int counter=1;
        // while(counter<=n)
        // {
        //     System.out.print(counter + " ");
        //     counter++;
        // }
        // System.out.println("Here is your Numbers...");
        // sc.close();
    //print sum of first n natural no.
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Number:");
        int n= sc.nextInt();
        int sum=0;
        int counter=1;
        while(counter<=n)
        {
            sum=sum+counter;
            counter++;
            
        }
        System.out.println("Total sum of the Numbers:"+sum);
        sc.close();

    }
}

package Loops;
import java.util.*;
public class PrimeNo {

    public static void main(String args[])
    {
        //need to understand this program not understand well
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your No.:");
        int n=sc.nextInt();
        if(n==2)
        {
            System.out.print("no. is Prime");
        }
        else{
            boolean isprime=true;
            //for(int i=2; i<n-1;i++)
                    //or
            for(int i=2; i<=Math.sqrt(n); i++)
            {
                //n is a multiple of i(i is not equal to 1 or n)
                if(n%i==0)
                {
                    isprime=false;
                }
                if(isprime==true)
                {
                    System.out.println("no. is prime.");
                }
                else
                {
                    System.out.println("no. is not prime.");
                }
            }


        }
        sc.close();
    }
}

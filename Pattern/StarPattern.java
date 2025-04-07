package Pattern;

import java.util.*;
public class StarPattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Positive No: ");
        int n= sc.nextInt();
        // for(int line=1;line<=n;line++ )
        // {
        //     for(int star=1; star<=line; star++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        for(int line=1; line<=n; line++)
    {
        for(int star=1; star<=n-line+1; star++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
        System.out.println("This is your pattern.");
        sc.close();
    }
}
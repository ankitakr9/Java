package Loops;
import java.util.*;
public class FactorialNo {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter positive No. Whose wants Factorial:");
        int num= sc.nextInt();
        int fact=1;
        for(int i=1; i<=num; i++)
        {
            fact= fact*i;
        }
        System.out.print("Factorial of this no. is: " +fact);
        sc.close();

    }
}

package Loops;
import java.util.*;
public class ContiKeywrd {
    public static void main(String args[])
    {
        // for (int i=1; i<=5; i++)
        // {
        //     if(i==3)
        //     continue;
        //     System.out.println(i);
        // }
        //Display all the number enter by user except multiple of 10
        
        
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Enter your No. : ");
             int n= sc.nextInt();
            if(n%10==0)
            continue;
            System.out.println("Number was:" + n);
        }while(false);

    

        sc.close();
    
    }
}

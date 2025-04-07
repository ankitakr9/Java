package Loops;
import java.util.*;
public class SumOfEvenOdd {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //int number;
        int choice;
        int evenSum=0;
        int oddSum=0;
        do{
            System.out.print("Enter your No.: ");
            int number= sc.nextInt();
            if(number%2==0)
            {
                evenSum=evenSum+number;
            }
            else{
                oddSum=oddSum+number;
            }
            System.out.print("If you want to Continue press 1 if not then press 0 or any other no.");
            choice= sc.nextInt();


        }while(choice==1);
        System.out.println("Sum of Even No.:" +evenSum);
        System.out.println("Sum of Odd No.:" +oddSum);
        sc.close();
    }
}

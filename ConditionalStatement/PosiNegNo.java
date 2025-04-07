package ConditionalStatement;
import java.util.*;
public class PosiNegNo {
    public static void main(String arga[])
    {
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        if(number<0)
        {
            System.out.println("Number is Negative No.");
        }
        else if(number>0)
        {
            System.out.println("Number is Positive No.");
        }
        else
         {
            System.out.println("You have Entered Zero.");
         }
         sc.close();
    }
}

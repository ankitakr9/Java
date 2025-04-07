package ConditionalStatement;
import java.util.*;
public class CalcUsingCases {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a : ");
        int a= sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter Operator : ");
        char Operator= sc.next().charAt(0);
        switch(Operator)
        {
            case '+':
            System.out.print("Addition of a And b:"+(a+b));
            break;
            case '-':
            System.out.print("subtraction of a And b:"+(a-b));
            break;
            case '*':
            System.out.print("Multiplication of a And b:"+(a*b));
            break;
            case '/':
            System.out.print("Division of a And b:"+(a/b));
            break;
            case '%':
            System.out.print("Modulo of a And b:"+(a%b));
            default:
            System.out.print("You have Entered Wrong Operator... Thank You....");
            sc.close();
            

        }
    }
}

package ConditionalStatement;
import java.util.*;
public class IncomeTaxCalc {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int Income= sc.nextInt();
        int tax;
        if(Income<=1200000)
        {
            tax=0;
            System.out.println("Your tax is:" +tax);
        }
        else if(Income>=1200001 && Income<=1600000)
        {
            tax=(int)(Income*0.15);
            System.out.println("Your tax is:" +tax);
        }
        else if(Income>=1600001 && Income<=2000000)
        {
            tax=(int)(Income*0.20);
            System.out.println("Your tax is:" +tax);
        }
        else if(Income>=2000000 && Income<=2400000)
        {
            tax=(int)(Income*0.25);
            System.out.println("Your tax is:" +tax);
        }
        else 
        {
            tax=(int)(Income*0.30);
            System.out.println("Your tax is:" +tax);
        }
        sc.close();


    }
    
}

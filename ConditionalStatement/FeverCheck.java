package ConditionalStatement;
import java.util.*;
public class FeverCheck {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        double temp= sc.nextDouble();
        if(temp >= 99 && temp<=105)
        {
            System.out.println("You have highly Fever.");
        }
        else if(temp>= 106 && temp<=115)
        {
            System.out.println("This person had environmental heatstroke, possibly made worse by alcohol consumption. ");
        }
        else
        {
            System.out.println("This is normal Body Temperature.");
        }
        sc.close();

    }
}

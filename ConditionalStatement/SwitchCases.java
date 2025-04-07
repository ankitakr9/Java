package ConditionalStatement;
import java.util.*;
public class SwitchCases {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        //int number= sc.nextInt();
        // switch(number)
        // {
        //     case 1:
        //     System.out.println("Samosa");
                //break;
        //     case 2:
        //     System.out.println("Burger");
               // break;
        //     case 3:
        //     System.out.println("Mango Shake");
                //break;
        //     default:
        //     System.out.println("We are realise.. we are dreaming.");
        //     sc.close();
        // }
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'b':
            System.out.println("Samosa");
            break;
            case 'c':
            System.out.println("Burger");
            break;
            case 'a':
            System.out.println("Mango Shake");
            break;
            default:
            System.out.println("We are realise.. we are dreaming.");
            sc.close();
        }
    }
}

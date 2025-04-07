import java.util.*;
public class TypeConversion {
    
    //Type Conversion known as coercion Conversion or implicit Conversion or voidening conversion
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        // int a= 25;
        // long b=a;
        // System.out.println(b);
        //Automatically type conversion
        float number= sc.nextInt();
        System.out.println(number);
        sc.close();
        // here error occured is callled "lossy conversion "
    }
    
}

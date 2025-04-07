
import java.util.*;
public class RectangleArea {
    public static void main(String args[])
    {
        // int a=10;
        // int b=20;
        // int Area= a*b;
        // System.out.println("Area of Rectangle:" + Area);
        Scanner sc=  new Scanner(System.in);
        int l= sc.nextInt();
        int b= sc.nextInt();
        int Area= l*b;
        int Perimeter= 2*(l+b);
        System.out.println(Area);
        System.out.println(Perimeter);
        sc.close();
    }
}

import java.util.*;

public class CircleArea {
    public static void main(String args[])
    {

        Scanner sc= new Scanner(System.in);
        float rad= sc.nextFloat();
        //3.14 read as double So, need to mantion 3.14f for float value
        float Area=3.14f*rad*rad;
        float Perimeter= 2 * 3.14f * rad;
        System.out.println(Area);
        System.out.println(Perimeter);
        sc.close();
        

        
    }
}

//import java.util.*;
public class DecToBin
{
    public static void decTobinary(int n)
    {
        int pow=0;
        int binNum=0;
        int myNum=n;
        while ( n > 0 )
        {
            int rem= n % 2;
            binNum= binNum + (rem *(int)(Math.pow(10 , pow)));
            pow++;
            n=n/2;
        }
        System.out.println("binary form of " + myNum + "=" +binNum );
    }
    public static void main(String args[]){
        decTobinary(9);
    }
}
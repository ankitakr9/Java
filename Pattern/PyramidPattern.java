package Pattern;
import java.util.*;
public class PyramidPattern {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter positive no: ");
        int n=sc.nextInt();
        for(int line=1; line<=n; line++)
        {
            for(int num=1; num<=line; num++)
            {
                System.out.print(" " +num );
            }
            System.out.println();
        }
        sc.close();
    }
}

import java.util.*;
public class CostItem {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        float pen= sc.nextFloat();
        float pencil= sc.nextFloat();
        float eraser= sc.nextFloat();
        float TotalCost= pen+pencil+eraser;
        System.out.println("Bill is " +TotalCost);
        // with 18% GST
        float newTotal= TotalCost + (0.18f *TotalCost);
        System.out.println("Bill is with 18% GST: "+newTotal );
        sc.close();
    }
}

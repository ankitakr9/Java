package ConditionalStatement;
import java.util.*;
public class ResultMarks {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int Marks= sc.nextInt();
        String ReportCard= Marks>=33 ? "Pass" : "Fail";
        System.out.println(ReportCard);
        sc.close();
    }
}

public class HollowRectangle {
    //public class Patterns
//{
    public static void Hollow_rectangle(int totRows, int totCols)
    {
        for (int i=1; i<=totRows; i++)
        {
            for (int j=1; j<=totCols; j++)
            {
                if(i==1|| j==1|| i==totRows|| j==totCols)
                {
                    Sytem.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            System.out.println();
            }
        }
    }
    public static void main (String args[])
    {
        Hollow_rectangle(4 , 5);
    }
//}
}

public class swapvaluebyfunc {
    public static void swap(int a, int b)
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    public static void main(String args[])
    {
        int a=5;
        int b=20;
        swap(a,b);
    }
}
//Or this is without make function
// public class swapvalue {
//   public static void main(String args[]) 
//   {
//     int a=60;
//     int b=70;
//     int temp=a;
//     a=b;
//     b=temp;
//     System.out.println("a="+a);
//     System.out.println("b="+b);
//   } 
// }

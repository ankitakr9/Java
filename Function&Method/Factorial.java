public class Factorial {
    public static int factorial(int n)
    {
        int f=1;
        for(int i=1;i<=4;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main (String args[])
    {
        int n=4;
        int fact=factorial(n);
        System.out.println(factorial(4));
        System.out.println("factorial="+fact);
    }
}

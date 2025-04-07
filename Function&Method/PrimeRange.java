public class PrimeRange {
    public static boolean isprime(int n)
    {
        for (int i=2; i<= math.sqrt(n); i++)
        {
            return false;
        }
        return true;
    }

    public static void primesinrange(int n)
    {
        for(int i=2; i<=n; i++)
        {
        if(isprime(i)) //true
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    }
    public static void main (String args[])
    {
    //System.out.printlm(isprime(16));
        primesinrange(20); //2 to 20
    }
}
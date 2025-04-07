public class CheckPrime
{
    //only for n>=2
    //optimize approach
    public static boolean isprime(int n)
    {
        //corner case
        //2
        //if(n==2)
        //{
            //return true;
        //}
        for(int i=2; i<=n-1; i++) //checkerror
        {
            if (n % i == 0) //completlydevide
            {
                return false;
            }
        
        }
        return true;

    }
    public static void main(String args[])
    {
        System.out.println(isprime(5));
        System.out.println(isprime(15));
    }
}

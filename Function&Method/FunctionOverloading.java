public class functionOverloading {
    // function overloading using datatype
    public static int sum(int a, int b)
    {return a+b;
    }
    public static float sum(float a, float b, float c)
    {
        return a+b+c;
    }
    public static void main(String args[])
    {
        System.out.println(sum(3,4));
        System.out.println(sum(1.2f,4.2f,9.0f));
    }
}
//function overloading using parameter
 public static int sum(int a, int b)
    {
        return a+b;
    
    }
    public static int sum(int a, int b, int c)
    {
        return a+b+c;
    }
    public static void main(String args[])
    {
        System.out.println(sum(3,5));
        System.out.println(sum(4,9,10));
    }

}
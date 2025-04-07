

public class TypePromotion {
    //type promotion used only with Expression
     public static void main(String args[])
    {
    
        // char a='a';
        // char b='b';
        // System.out.println((int)(b));
        // System.out.println((int)(a));
        // System.out.println(b-a);
        // short a=5;
        // byte b=25;
        // char c='c';
        // byte bt=(byte)(a+b+c); //type casting
        // System.out.println(bt);
        //get senseless output for above code
        // int a=10;
        // float b=20.25f;
        // long c=25;
        // double d=30;
        // double ans= a+b+c+d;
        // System.out.println(ans);
        // byte b=5;
        // byte a=(byte)(b*2);
        // System.out.println(a);
        byte b=4;
        char c='a';
        short s=512;
        int i=1000;
        float f=3.14f;
        double d=99.9954;
        double Ans= (f*b)+(i%c)-(d*s);
        System.out.println(Ans);

    }   
}

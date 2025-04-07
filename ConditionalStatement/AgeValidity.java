package ConditionalStatement;
import java.util.*;
public class AgeValidity {
    public static void main(String args[])
    {
    //int age=22;
//     if(age>=18)
//     {
//         System.out.println("adult: drives and vote");
//     }
//    else 
//    {
//     System.out.println("Not adult");
//    }
    // int age=17;
    // if(age>=18)
    // {
    //     System.out.println("Adult:drive &vote");
    // }
    // if(age>13&& age<18)
    // {
    //     System.out.println("Teenager");
    // }
    // else 
    // {
    //     System.out.println("Not Adult");
    // }
    Scanner sc= new Scanner(System.in);
    int age=sc. nextInt();
    if(age>=18)
    {
        System.out.println("Adult:drive &vote");
    }
    else if(age>13&& age<18)
    {
        System.out.println("Teenager");
    }
    else 
    {
        System.out.println("Child");
    }
    sc.close();

}
}

import java.util.*;

public class DiffInput {
    
         public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        //only for before space
        String input=sc.next();
        System.out.println(input);
        //for space full string
        String name=sc.nextLine();
        System.out.print(name);
        int number=sc.nextInt();
        System.out.println(number);
        float price=sc.nextFloat();
        System.out.println(price);
        double tax=sc.nextDouble();
        System.out.println(tax);
        boolean input2=sc.nextBoolean();
        System.out.println(input2);
        long input3=sc.nextLong();
        System.out.println(input3);
        short input4=sc.nextShort();
        System.out.println(input4);
        sc.close();
    }
}

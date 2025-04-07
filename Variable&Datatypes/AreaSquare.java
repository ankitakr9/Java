import java.util.Scanner;
public class AreaSquare {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int Square= a*a;
        int Perimeter= 4*a;
        System.out.println(Square);
        System.out.println(Perimeter);
        sc.close();
    }
}

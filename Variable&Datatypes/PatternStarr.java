public class PatternStarr {
    public static void Star(int n)
    {
        
        for(int i=1; i<=n; i++)
        {
             
            for(int j=1; j<=(n-i); j++)
            { System.out.print(" ");
        }
        for(int j=1; j<=(2*i)-1; j++)
        {
                if(j%2==0)
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            
            System.out.println();
        }
        for(int i=n; i>=1; i--)
        {
             
            for(int j=1; j<=(n-i); j++)
            { System.out.print(" ");
        }
        for(int j=1; j<=(2*i)-1; j++)
        {
                if(j%2==0)
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            
            System.out.println();
        }
     
    }
    

    public static void main(String[] args) {
        Star(5);
    }
}

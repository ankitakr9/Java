public class PlusPattern {
    public static void main(String args[])
    {
        for(int line=2; line<=10; line++)
        {
            for(int plus=2; plus<=line; plus++)
            {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}

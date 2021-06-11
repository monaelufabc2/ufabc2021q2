import java.util.Scanner;

public class Lua
{
    public static void main(String[] args)
    {
        byte m1, m2;
        Scanner scan = new Scanner(System.in);

        m1 = scan.nextByte();
        m2 = scan.nextByte();

        if(m2 <= 2)
        {
            System.out.println("Nova");
        }
        else if(m2 >= 97)
        {
            System.out.println("Cheia");
        }
        else if(m1 < m2)
        {
            System.out.println("Crescente");
        }
        else
        {
            System.out.println("Minguante");
        }
    }
}
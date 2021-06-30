import java.util.Scanner;

public class ComparandoStrings
{
    public static void main(String[] args)
    {
        String s1, s2;
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext())
        {
            s1 = scan.next();
            s2 = scan.next();
            if(saoStringsIguais(s1, s2))
            {
                System.out.println("iguais");
            }
            else
            {
                System.out.println("diferentes");
            }
        }
    }

    public static boolean saoStringsIguais(String s1, String s2)
    {
        return s1.compareTo(s2) == 0;
    }
}
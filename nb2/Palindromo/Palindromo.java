import java.util.Scanner;

public class Palindromo
{
    public static void main(String[] args)
    {
        String str;
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext())
        {
            str = scan.next();
            if(ehPalindromo(str))
            {
                System.out.println("sim");
            }
            else
            {
                System.out.println("nao");
            }
        }
    }

    public static boolean ehPalindromo(String s)
    {
        int i;
        boolean palindromo = true;

        for(i=0; i<s.length()/2 && palindromo; i++)
        {
            if(s.charAt(i) != s.charAt(s.length()-1-i))
            {
                palindromo = false;
            }
        }
        return palindromo;
    }
}
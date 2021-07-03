import java.util.Scanner;

public class Espacado
{
    public static void main(String[] args)
    {
        String str;
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext())
        {
            str = scan.next();
            imprimeEspacado(str);
        }
    }

    public static void imprimeEspacado(String s)
    {
        int i;
        for(i=0; i<s.length(); i++)
        {
            if(i < s.length()-1)
            {
                System.out.print(s.charAt(i) + " ");
            }
            else
            {
                System.out.println(s.charAt(i));
            }
        }
    }
}
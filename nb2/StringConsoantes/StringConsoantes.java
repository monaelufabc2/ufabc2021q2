import java.util.Scanner;

public class StringConsoantes
{
    public static void main(String[] args)
    {
        String str;
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext())
        {
            str = scan.next();
            System.out.println(strConsoantes(str));
        }
    }

    public static String strConsoantes(String s)
    {
        int i;
        String str = "";

        for(i=0; i<s.length(); i++)
        {
            if(Character.toUpperCase(s.charAt(i)) != 'A' && Character.toUpperCase(s.charAt(i)) != 'E' && Character.toUpperCase(s.charAt(i)) != 'I' && Character.toUpperCase(s.charAt(i)) != 'O' && Character.toUpperCase(s.charAt(i)) != 'U')
            {
                str = str + s.charAt(i);
            }
        }
        return str;
    }
}
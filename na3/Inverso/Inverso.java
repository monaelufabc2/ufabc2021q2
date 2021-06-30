import java.util.Scanner;

public class Inverso
{
    public static void main(String[] args)
    {
        String palavra;
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext())
        {
            palavra = scan.next();
            System.out.println(invertePalavra(palavra));
        }
    }

    public static String invertePalavra(String p)
    {
        String invP = "";
        int i;

        for(i=p.length()-1; i>=0; i--)
        {
            invP = invP + p.charAt(i);
        }
        return invP;
    }
}
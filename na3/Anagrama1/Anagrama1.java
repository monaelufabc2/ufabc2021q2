import java.util.Scanner;

public class Anagrama1
{
    public static void main(String[] args)
    {
        String palavra, palLista;
        int n, i;
        boolean anagrama;
        Scanner scan = new Scanner(System.in);

        palavra = scan.next();
        n = scan.nextInt();
        anagrama = false;
        for(i=0; i<n; i++)
        {
            palLista = scan.next();
            if(ehAnagrana(palavra, palLista))
            {
                anagrama = true;
            }
        }
        if(anagrama)
        {
            System.out.println("sim");
        }
        else
        {
            System.out.println("nao");
        }
    }

    public static boolean ehAnagrana(String p, String pl)
    {
        int i, j;
        boolean anagrama = true;

        if(p.length() == pl.length())
        {
            for(i=0, j=pl.length()-1; i<p.length() && j>=0 && anagrama; i++, j--)
            {
                if(p.charAt(i) != pl.charAt(j))
                {
                    anagrama = false;
                }
            }
            return anagrama;
        }
        else
        {
            return false;
        }
    }
}
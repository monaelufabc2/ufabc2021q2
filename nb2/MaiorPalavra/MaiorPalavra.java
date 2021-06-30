import java.util.Scanner;

public class MaiorPalavra
{
    public static void main(String[] args)
    {
        String palavra, maiorPalavra = "";
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext())
        {
            palavra = scan.next();
            if(palavra.length() > maiorPalavra.length())
            {
                maiorPalavra = palavra;
            }
        }

        if(maiorPalavra.length() == 0)
        {
            System.out.println("Nenhuma palavra foi informada");
        }
        else
        {
            System.out.println("A maior palavra informada foi " + maiorPalavra);
        }
    }
}
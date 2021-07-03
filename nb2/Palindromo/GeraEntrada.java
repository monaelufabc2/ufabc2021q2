import java.util.Random;

public class GeraEntrada
{
    public static void main(String[] args)
    {
        int n = Integer.valueOf(args[0]), i;
        Random rd = new Random();

        for(i=0; i<n-1; i++)
        {
            if(rd.nextInt(100) < 35)
            {
                System.out.println(geraPalindromo(rd.nextInt(200)+1));
            }
            else
            {
                System.out.println(geraPalavra(rd.nextInt(200)+1));
            }
        }
        System.out.println(geraPalavra(rd.nextInt(200)+1));
    }

    public static String geraPalavra(int n)
    {
        String str = "";
        Random rd = new Random();
        int i;

        for(i=0; i<n; i++)
        {
            str = str + (char)('a' + rd.nextInt(26));
        }
        return str;
    }

    public static String geraPalindromo(int n)
    {
        String strEsq = geraPalavra(n/2);
        String str = strEsq;
        Random rd = new Random();
        int i;

        if(n==1)
        {
            strEsq = geraPalavra(1);
        }

        str = strEsq;

        if(n != 200 && rd.nextInt(100) < 50)
        {
            str = str + 'x';
        }

        for(i=strEsq.length()-1; i>=0; i--)
        {
            str = str + strEsq.charAt(i);
        }

        return str;
    }
}
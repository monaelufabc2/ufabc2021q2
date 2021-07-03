import java.util.Random;

public class GeraEntrada
{
    public static void main(String[] args)
    {
        int n = Integer.valueOf(args[0]), i;
        Random rd = new Random();

        for(i=0; i<n-1; i++)
        {
            System.out.println(geraPalavra(rd.nextInt(100)+1) + " " + geraPalavra(rd.nextInt(100)+1));
        }
        System.out.print(geraPalavra(rd.nextInt(100)+1) + " " + geraPalavra(rd.nextInt(100)+1));
    }

    public static String geraPalavra(int n)
    {
        String str = "";
        Random rd = new Random();
        int i;

        for(i=0; i<n; i++)
        {
            if(rd.nextInt(100) < 50)
            {
                str = str + (char)('A' + rd.nextInt(26));
            }
            else
            {
                str = str + (char)('a' + rd.nextInt(26));
            }
        }
        return str;
    }
}
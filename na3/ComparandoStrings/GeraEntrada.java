import java.util.Random;

public class GeraEntrada
{
    public static void main(String[] args)
    {
        int n = Integer.valueOf(args[0]), i, sort;
        String s1, s2;
        Random rd = new Random();

        for(i=0; i<n-1; i++)
        {
            s1 = geraString(rd.nextInt(100)+1);
            s2 = geraString(rd.nextInt(100)+1);
            sort = rd.nextInt(101);
            if(sort < 50)
            {
                System.out.println(s1 + " " + s2);
            }
            else
            {
                System.out.println(s1 + " " + s1);
            }
        }
        s1 = geraString(rd.nextInt(100)+1);
        s2 = geraString(rd.nextInt(100)+1);
        System.out.print(s1 + " " + s2);
    }

    public static String geraString(int n)
    {
        String str = "";
        Random rd = new Random();
        int i, sort;

        for(i=0; i<n; i++)
        {
            sort = rd.nextInt(101);
            if(sort < 50)
            {
                str = str + (char)('a' + rd.nextInt(26));
            }
            else
            {
                str = str + (char)('A' + rd.nextInt(26));
            }
        }
        return str;
    }
}
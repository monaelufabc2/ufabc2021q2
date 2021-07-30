import java.util.Random;

public class GeraEntrada
{
    public static void main(String[] args)
    {
        int n = Integer.valueOf(args[0]), m = Integer.valueOf(args[1]), i, j;
        Random rd = new Random();

        System.out.println(n + " " + m);
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                System.out.print(rd.nextInt(1001) + (j<m-1?" ":"\n"));
            }
        }
    }
}
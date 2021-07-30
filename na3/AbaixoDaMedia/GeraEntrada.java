import java.util.Random;

public class GeraEntrada
{
    public static void main(String[] args)
    {
        int n = Integer.valueOf(args[0]), i, j, nInt, nRea;
        Random rd = new Random();

        System.out.println(n);
        for(i=0; i<n; i++)
        {
            for(j=0; j<3; j++)
            {
                nInt = rd.nextInt(11);
                if(nInt != 10)
                {
                    nRea = rd.nextInt(100);
                }
                else
                {
                    nRea = 0;
                }
                System.out.printf("%d.%02d%c", nInt, nRea, (j<2?' ':'\n'));
            }
        }

    }
}
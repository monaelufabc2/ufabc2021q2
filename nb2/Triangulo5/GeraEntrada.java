import java.util.Random;

public class GeraEntrada
{
    public static void main(String[] args)
    {
        int n = Integer.valueOf(args[0]), i = 0;
        float a1, a2, a3;
        Random rd = new Random();

        do
        {
            a1 = rd.nextFloat() * 360f;
            a2 = rd.nextFloat() * 360f;
            a3 = rd.nextFloat() * 360f;
            System.out.printf("%.1f %.1f %.1f%s", a1, a2, a3, (i < n && a1 + a2 + a3 != 180f?"\n":""));
            i = i + 1;
        }while(i < n && a1 + a2 + a3 != 180f);

        if(i == n)
        {
            do
            {
                a1 = rd.nextFloat() * 360f;
                a2 = rd.nextFloat() * 360f;
                a3 = rd.nextFloat() * 360f;
            }while( a1 + a2 + a3 != 180f);
            System.out.printf("%.1f %.1f %.1f", a1, a2, a3);
        }
    }
}
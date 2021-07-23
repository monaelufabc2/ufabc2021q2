import java.util.Random;

public class GeraEntrada
{
    public static void main(String[] args)
    {
        int n, i, v[], m, val;
        Random rd = new Random();

        if(args.length != 0)
        {
            n = Integer.valueOf(args[0]);
        }
        else
        {
            n = rd.nextInt(100000) + 1;
        }

        v = new int[n];
        for(i=0; i<n; i++)
        {
            v[i] = rd.nextInt();
        }

        bubbleSort(v, n);

        System.out.println(n);
        for(i=0; i<n; i++)
        {
            System.out.print(v[i] + (i<n-1?" ":"\n"));
        }

        m = rd.nextInt(1000) + 1;
        System.out.println(m);
        for(i=0; i<m-1; i++)
        {
            if(rd.nextInt(100) < 40)
            {
                System.out.println(v[rd.nextInt(n)]);
            }
            else
            {
                System.out.println(rd.nextInt());
            }
        }
        System.out.print(rd.nextInt());
    }

    public static void bubbleSort(int v[], int n)
    {
        int i, j, aux;
        for(i=0; i<n-1; i++)
        {
            for(j=0; j<n-1-i; j++)
            {
                if(v[j] > v[j+1])
                {
                    aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
    }
}
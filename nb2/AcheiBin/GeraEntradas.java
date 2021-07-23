import java.util.Random;

public class GeraEntradas
{
    public static void main(String[] args)
    {
        int n, i, m, val, v[];
        Random rd = new Random();

        if(args.length != 0)
        {
            n = Integer.valueOf(args[0]);
        }
        else
        {
            n = rd.nextInt(100000)+1;
        }

        v = new int[n];
        for(i=0; i<n; i++)
        {
            v[i] = rd.nextInt(100000);
        }

        selectionSort(v, n);

        System.out.println(n);
        for(i=0; i<n; i++)
        {
            System.out.print(v[i] + (i<n-1?" ":"\n"));
        }

        m = rd.nextInt(1000)+1;
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

    public static void selectionSort(int v[], int n)
    {
        int i, j, iMenor, aux;

        for(i=0; i<n-1; i++)
        {
            iMenor = i;
            for(j=i+1; j<n; j++)
            {
                if(v[j] < v[iMenor])
                {
                    iMenor = j;
                }
            }
            aux = v[i];
            v[i] = v[iMenor];
            v[iMenor] = aux;
        }
    }
}
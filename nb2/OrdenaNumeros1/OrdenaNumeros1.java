import java.util.Scanner;

public class OrdenaNumeros1
{
    public static void main(String[] args)
    {
        int n, i, v[];
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        v = new int[n];
        for(i=0; i<n; i++)
        {
            v[i] = scan.nextInt();
        }

        bubbleSort(v, n);

        for(i=0; i<n; i++)
        {
            System.out.print(v[i] + (i<n-1?" ":"\n"));
        }
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
import java.util.Scanner;

public class SomaVet
{
    public static void main(String[] args)
    {
        int n, v[], i;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        v = new int[n];

        for(i=0; i<n; i++)
        {
            v[i] = scan.nextInt();
        }

        System.out.println(somaVetor(v, n));
    }

    public static long somaVetor(int v[], int n)
    {
        int i;
        long soma = 0;
        for(i=0; i<n; i++)
        {
            soma = soma + v[i];
        }
        return soma;
    }
}
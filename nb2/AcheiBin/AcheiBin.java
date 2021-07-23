import java.util.Scanner;

public class AcheiBin
{
    public static void main(String[] args)
    {
        int n, i, m, x, v[];
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        v = new int[n];
        for(i=0; i<n; i++)
        {
            v[i] = scan.nextInt();
        }

        m = scan.nextInt();
        for(i=0; i<m; i++)
        {
            x = scan.nextInt();
            if(buscaBinaria(v, n, x))
            {
                System.out.println("ACHEI");
            }
            else
            {
                System.out.println("NAO ACHEI");
            }
        }
    }

    public static boolean buscaBinaria(int v[], int n, int x)
    {
        int esq = 0, dir = n-1, meio;

        while(esq <= dir)
        {
            meio = (esq+dir)/2;
            if(v[meio] == x)
            {
                return true;
            }
            else if(v[meio] > x)
            {
                dir = meio-1;
            }
            else
            {
                esq = meio+1;
            }
        }
        return false;
    }
}
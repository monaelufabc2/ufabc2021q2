import java.util.Scanner;

public class Achei
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
            if(buscaLinear(v, n, x))
            {
                System.out.println("ACHEI");
            }
            else
            {
                System.out.println("NAO ACHEI");
            }
        }
    }

    public static boolean buscaLinear(int v[], int n, int x)
    {
        int i;
        for(i=0; i<n; i++)
        {
            if(v[i] == x)
            {
                return true;
            }
        }
        return false;
    }
}
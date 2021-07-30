import java.util.Scanner;

public class DiagonalPrincipal
{
    public static void main(String[] args)
    {
        char oper;
        int mat[][] = new int[12][12], i, j;
        Scanner scan = new Scanner(System.in);

        oper = scan.next().charAt(0);

        for(i=0; i<12; i++)
        {
            for(j=0; j<12; j++)
            {
                mat[i][j] = scan.nextInt();
            }
        }

        if(oper == 'S')
        {
            System.out.printf("%.1f\n", somaDiagonalPrincipal(mat, 12));
        }
        else
        {
            System.out.printf("%.1f\n", mediaDiagonalPrincipal(mat, 12));
        }
    }

    public static float mediaDiagonalPrincipal(int m[][], int n)
    {
        return somaDiagonalPrincipal(m, n) / n;
    }

    public static float somaDiagonalPrincipal(int m[][], int n)
    {
        float soma = 0f;
        int i;

        for(i=0; i<n; i++)
        {
            soma = soma + m[i][i];
        }
        return soma;
    }
}
import java.util.Scanner;

public class AcimaDiag
{
    public static void main(String[] args)
    {
        char oper;
        int i, j, mat[][] = new int[12][12];
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
            System.out.printf("%.1f\n", somaAcimaDiag(mat, 12));
        }
        else
        {
            System.out.printf("%.1f\n", mediaAcimaDiag(mat, 12));
        }
    }

    public static float somaAcimaDiag(int m[][], int n)
    {
        float soma = 0f;
        int i, j;

        for(i=0; i<n; i++)
        {
            for(j=i+1; j<n; j++)
            {
                soma = soma + m[i][j];
            }
        }
        return soma;
    }

    public static float mediaAcimaDiag(int m[][], int n)
    {
        return somaAcimaDiag(m, n) / (((n*n)-n)/2f);
    }
}
import java.util.Scanner;

public class SomaMat5
{
    public static void main(String[] args)
    {
        int mat[][], n, m, i, j;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();

        mat = new int[n][m];

        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                mat[i][j] = scan.nextInt();
            }
        }

        System.out.println("Somatorio da Matriz: " + somaMat(mat, n, m));
    }

    public static int somaMat(int mat[][], int n, int m)
    {
        int i, j, soma = 0;
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                soma = soma + mat[i][j];
            }
        }
        return soma;
    }
}
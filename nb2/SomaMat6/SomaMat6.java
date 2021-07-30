import java.util.Scanner;

public class SomaMat6
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

        System.out.println("Somatorio Matriz: " + somaMat(mat, n, m));
    }

    public static long somaMat(int mat[][], int n, int m)
    {
        int i, j;
        long soma = 0, somaLinha = 0;
        for(i=0; i<n; i++)
        {
            somaLinha = somaVetor(mat[i], m);
            System.out.println("Somatorio da Linha " + i + ": " + somaLinha);
            soma = soma + somaLinha;
        }
        return soma;
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
import java.util.Scanner;

public class NonOdd
{
    public static void main(String[] args)
    {
        int m, n, i, j, matriz[][];
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();
        matriz = new int[n][m];

        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                matriz[i][j] = scan.nextInt();
            }
        }

        nonOddMatrix(matriz, n, m);

        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                System.out.print(matriz[i][j] + (j<m-1?" ":"\n"));
            }
        }
    }

    public static void nonOddMatrix(int m[][], int lin, int col)
    {
        int i, j;
        for(i=0; i<lin; i++)
        {
            for(j=0; j<col; j++)
            {
                if(m[i][j]%2 != 0)
                {
                    m[i][j] = -1;
                }
            }
        }
    }
}
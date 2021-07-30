import java.util.Scanner;

public class NonOdd
{
    public static void main(String[] args)
    {
        int n, m, i, j, mat[][];
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

        nonOddMatrix(mat, n, m);

        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                System.out.print(mat[i][j] + (j<m-1?" ":"\n"));
            }
        }
    }

    public static void nonOddMatrix(int m[][], int l, int c)
    {
        int i, j;

        for(i=0; i<l; i++)
        {
            for(j=0; j<c; j++)
            {
                if(m[i][j]%2 != 0)
                {
                    m[i][j] = -1;
                }
            }
        }
    }
}
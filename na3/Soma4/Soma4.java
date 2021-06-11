import java.util.Scanner;

public class Soma4
{
    public static void main(String[] args)
    {
        int n, m, i, j;
        long num, soma;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        for(i=0; i<n; i++)
        {
            m = scan.nextInt();
            soma = 0l;
            for(j=0; j<m; j++)
            {
                num = scan.nextLong();
                soma = soma + num;
            }
            System.out.println(soma);
        }
    }
}
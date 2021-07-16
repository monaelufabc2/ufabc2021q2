import java.util.Scanner;

public class ElementosPares
{
    public static void main(String[] args)
    {
        int n, i, vet[];
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        vet = new int[n];

        for(i=0; i<n; i++)
        {
            vet[i] = scan.nextInt();
        }

        System.out.println(printContaPares(vet, n));
    }

    public static int printContaPares(int[] v, int n)
    {
        int i, contaPares = 0;
        for(i=0; i<n; i++)
        {
            if(v[i]%2 == 0)
            {
                System.out.print(v[i] + " ");
                contaPares = contaPares + 1;
            }
        }
        return contaPares;
    }
}
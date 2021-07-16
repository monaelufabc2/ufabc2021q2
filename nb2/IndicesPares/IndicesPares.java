import java.util.Scanner;

public class IndicesPares
{
    public static void main(String[] args)
    {
        int vet[], n, i;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        vet = new int[n];

        for(i=0; i<n; i++)
        {
            vet[i] = scan.nextInt();
        }
        System.out.println(printIndParContaPar(vet, n));
    }

    public static int printIndParContaPar(int[] v, int n)
    {
        int i, contaPares = 0;
        for(i=0; i<n; i++)
        {
            if(i%2==0)
            {
                System.out.print(v[i] + " ");
            }
            if(v[i]%2==0)
            {
                contaPares = contaPares + 1;
            }
        }
        return contaPares;
    }
}
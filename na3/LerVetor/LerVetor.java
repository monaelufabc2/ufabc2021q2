import java.util.Scanner;

public class LerVetor
{
    public static void main(String[] args)
    {
        int vetor[] = new int[100], lim, i;
        Scanner scan = new Scanner(System.in);

        do
        {
            lim = scan.nextInt();
        }while(lim<0 || lim>100);

        scanVetor(vetor, lim);

        for(i=0; i<100; i++)
        {
            System.out.print(vetor[i] + (i<99?" ":"\n"));
        }
    }

    public static void scanVetor(int[] v, int n)
    {
        int i;
        Scanner scan = new Scanner(System.in);

        for(i=0; i<=n; i++)
        {
            v[i] = scan.nextInt();
        }
    }
}

import java.util.Scanner;

public class FibonacciVetor
{
    public static void main(String[] args)
    {
        long vetFibo[];
        int i;
        Scanner scan = new Scanner(System.in);

        vetFibo = constroiVetorFibonacci();

        for(i=0; i<=60; i++)
        {
            System.out.println("Fib(" + i + "): " + vetFibo[i]);
        }
    }

    public static long[] constroiVetorFibonacci()
    {
        int i;
        long vf[] = new long[61];

        vf[0] = 0;
        vf[1] = 1;
        for(i=2; i<61; i++)
        {
            vf[i] = vf[i-2] + vf[i-1];
        }

        return vf;
    }
}
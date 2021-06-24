import java.util.Scanner;

public class NumerosAmigos
{
    public static void main(String[] args)
    {
        int numM, numN;
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext())
        {
            numM = scan.nextInt();
            numN = scan.nextInt();
            if(saoNumAmigos(numM, numN))
            {
                System.out.println("amigos");
            }
            else
            {
                System.out.println("nao amigos");
            }

        }
    }

    public static boolean saoNumAmigos(int m, int n)
    {
        return somaDivisores(m) == n && somaDivisores(n) == m;
    }

    public static int somaDivisores(int n)
    {
        int i, somaDiv = 0;
        for(i=1; i<n; i++)
        {
            if(n%i == 0)
            {
                somaDiv = somaDiv + i;
            }
        }
        return somaDiv;
    }
}
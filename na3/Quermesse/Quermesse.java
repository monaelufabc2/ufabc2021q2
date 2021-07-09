import java.util.Scanner;

public class Quermesse
{
    public static void main(String[] args)
    {
        int n, i, ingresso, ganhador = 0, nTst = 1;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        while(n != 0)
        {
            for(i=0; i<n; i++)
            {
                ingresso = scan.nextInt();
                if(ingresso == i+1)
                {
                    ganhador = ingresso;
                }
            }
            System.out.println("Teste " + nTst);
            System.out.println(ganhador);
            System.out.println();
            n = scan.nextInt();
            nTst = nTst + 1;
        }
    }
}
import java.util.Scanner;

public class Robo
{
    public static void main(String[] args)
    {
        int t, i, j, n, com[], pos;
        String comando;
        Scanner scan = new Scanner(System.in);

        t = scan.nextInt();
        for(i=0; i<t; i++)
        {
            n = scan.nextInt();
            com = new int[n];
            for(j=0; j<n; j++)
            {
                comando = scan.next();
                if(comando.compareTo("LEFT") == 0)
                {
                    com[j] = -1;
                }
                else if(comando.compareTo("RIGHT") == 0)
                {
                    com[j] = 1;
                }
                else
                {
                    scan.next();
                    pos = scan.nextInt();
                    com[j] = com[pos-1];
                }
            }
            System.out.println(posicaoFinalDoRobo(com, n));
        }
    }

    public static int posicaoFinalDoRobo(int v[], int n)
    {
        int i, s=0;
        for(i=0; i<n; i++)
        {
            s = s + v[i];
        }
        return s;
    }
}
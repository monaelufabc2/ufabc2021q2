import java.util.Scanner;

public class Esquerda2
{
    public static void main(String[] args)
    {
        int n;
        String comandos;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        comandos = scan.next();

        System.out.println(direcaoFinalDoSoldado(comandos, n));
    }

    public static char direcaoFinalDoSoldado(String com, int n)
    {
        int i, dirCod = 0;

        for(i=0; i<n; i++)
        {
            if(com.charAt(i) == 'D')
            {
                dirCod = (dirCod + 1)%4;
            }
            else
            {
                dirCod = dirCod - 1;
                if(dirCod == -1)
                {
                    dirCod = 3;
                }
            }
        }
        if(dirCod == 0)
        {
            return 'N';
        }
        else if(dirCod == 1)
        {
            return 'L';
        }
        else if(dirCod == 2)
        {
            return 'S';
        }
        else
        {
            return 'O';
        }
    }
}
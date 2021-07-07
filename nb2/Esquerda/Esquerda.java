import java.util.Scanner;

public class Esquerda
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
        int i;
        double angulo = 0.0;

        for(i=0; i<n; i++)
        {
            if(com.charAt(i) == 'D')
            {
                angulo = angulo + 90.0;
            }
            else
            {
                angulo = angulo - 90.0;
            }
        }
        /*
        System.out.println("ANGULO: " + angulo);
        System.out.println("ANGULO rd: " + (Math.PI*angulo)/180.0);
        System.out.println("*ANGULO rd: " + Math.toRadians(angulo));
        System.out.println("SIN: " + Math.sin((Math.PI*angulo)/180.0));
        System.out.println("COS: " + Math.cos((Math.PI*angulo)/180.0));
        System.out.println("*SIN: " + Math.sin(Math.toRadians(angulo)));
        System.out.println("*COS: " + Math.cos(Math.toRadians(angulo)));
        */
        if(Math.cos(Math.toRadians(angulo)) == 1)
        {
            return 'N';
        }
        else if(Math.cos(Math.toRadians(angulo)) == -1)
        {
            return 'S';
        }
        else if(Math.sin(Math.toRadians(angulo)) == 1)
        {
            return 'L';
        }
        else
        {
            return 'O';
        }
    }
}
import java.util.Scanner;

public class Loteria2
{
    public static void main(String[] args)
    {
        int n, i, j, qtdAcertos, qtdSena = 0, qtdQuina = 0, qtdQuadra = 0, sorteio[] = new int[6], aposta[] = new int[6];
        Scanner scan = new Scanner(System.in);

        for(i=0; i<6; i++)
        {
            sorteio[i] = scan.nextInt();
        }

        n = scan.nextInt();
        for(i=0; i<n; i++)
        {
            for(j=0; j<6; j++)
            {
                aposta[j] = scan.nextInt();
            }

            qtdAcertos = confereAposta(sorteio, aposta);

            if(qtdAcertos == 6)
            {
                qtdSena = qtdSena + 1;
            }
            else if(qtdAcertos == 5)
            {
                qtdQuina = qtdQuina + 1;
            }
            else if(qtdAcertos == 4)
            {
                qtdQuadra = qtdQuadra + 1;
            }
        }

        if(qtdSena != 0)
        {
            System.out.println("Houve " + qtdSena + " acertador(es) da sena");
        }
        else
        {
            System.out.println("Nao houve acertador para sena");
        }

        if(qtdQuina != 0)
        {
            System.out.println("Houve " + qtdQuina + " acertador(es) da quina");
        }
        else
        {
            System.out.println("Nao houve acertador para quina");
        }

        if(qtdQuadra != 0)
        {
            System.out.println("Houve " + qtdQuadra + " acertador(es) da quadra");
        }
        else
        {
            System.out.println("Nao houve acertador para quadra");
        }
    }

    public static int confereAposta(int sort[], int ap[])
    {
        int qtdAcertos = 0, i, j;
        boolean achei;

        for(i=0; i<6; i++)
        {
            achei = false;
            for(j=0; j<6 && !achei; j++)
            {
                if(sort[i] == ap[j])
                {
                    qtdAcertos = qtdAcertos + 1;
                    achei = true;
                }
            }
        }
        return qtdAcertos;
    }
}
import java.util.Scanner;

public class Agua
{
    public static void main(String[] args)
    {
        char part;
        int qtdO = 0, qtdX = 0, qtdG = 0, qtdY = 0, qtdTot = 0;
        float percO, percX, percG, percY;
        Scanner scan = new Scanner(System.in);

        part = scan.next().charAt(0);
        while(part != 'F')
        {
            if(part == 'O')
            {
                qtdO = qtdO + 1;
            }
            else if(part == 'X')
            {
                qtdX = qtdX + 1;
            }
            else if(part == 'G')
            {
                qtdG = qtdG + 1;
            }
            else if(part == 'Y')
            {
                qtdY = qtdY + 1;
            }
            qtdTot = qtdTot + 1;
            part = scan.next().charAt(0);
        }

        percO = (qtdO * 100f) / qtdTot;
        percX = (qtdX * 100f) / qtdTot;
        percG = (qtdG * 100f) / qtdTot;
        percY = (qtdY * 100f) / qtdTot;

        if(percO <= 40f && percX <= 20f && percG <= 10f && percY <= 4f && (percO + percX + percG + percY <= 60f))
        {
            System.out.println("propria para consumo");
        }
        else
        {
            System.out.println("impropria para consumo");
        }
    }
}
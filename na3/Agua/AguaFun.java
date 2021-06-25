import java.util.Scanner;

public class AguaFun
{
    public static void main(String[] args)
    {
        int qO = 0, qX = 0, qG = 0, qY = 0, qTot = 0;
        char part;
        Scanner scan = new Scanner(System.in);

        part = scan.next().charAt(0);
        while(part != 'F')
        {
            switch(part)
            {
                case 'O':   qO = qO + 1;
                            break;
                case 'X':   qX = qX + 1;
                            break;
                case 'G':   qG = qG + 1;
                            break;
                case 'Y':   qY = qY + 1;
            }
            qTot = qTot + 1;
            part = scan.next().charAt(0);
        }

        if(aguaPropria(qO, qX, qG, qY, qTot))
        {
            System.out.println("propria para consumo");
        }
        else
        {
            System.out.println("impropria para consumo");
        }

    }

    public static boolean aguaPropria(int qO, int qX, int qG, int qY, int qTot)
    {
        float pO = (qO * 100f)/qTot;
        float pX = (qX * 100f)/qTot;
        float pG = (qG * 100f)/qTot;
        float pY = (qY * 100f)/qTot;

        return (pO <= 40f && pX <= 20f && pG <= 10f && pY <= 4f && (pO + pX + pG + pY) <= 60);
    }
}

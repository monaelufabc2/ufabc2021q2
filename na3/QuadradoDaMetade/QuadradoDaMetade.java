import java.util.Scanner;

public class QuadradoDaMetade
{
    public static void main(String[] args)
    {
        int num;
        boolean resp;
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext())
        {
            num = scan.nextInt();
            resp = ehQuadradoDaMetade(num);
            if(resp)
            {
                System.out.println("OK");
            }
            else
            {
                System.out.println("NOK");
            }
        }
    }

    public static boolean ehQuadradoDaMetade(int num)
    {
        int dirNum = num/100;
        int esqNum = num%100;
        int somaDirEsq = dirNum + esqNum;

        if(somaDirEsq*somaDirEsq == num)
        {
            return true;
        }
        return false;
    }
}
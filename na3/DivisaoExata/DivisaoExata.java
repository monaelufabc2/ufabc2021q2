import java.util.Scanner;

public class DivisaoExata
{
    public static void main(String[] args)
    {
        long numX, numY;
        Scanner scan = new Scanner(System.in);

        numX = scan.nextLong();
        numY = scan.nextLong();

        if(numX % numY == 0)
        {
            System.out.println("a divisao de " + numX + " por " + numY + " eh exata.");
        }
    }
}
import java.util.Scanner;

public class DivisaoExata
{
    public static void main(String[] args)
    {
        long numA, numB;
        Scanner scan = new Scanner(System.in);

        numA = scan.nextLong();
        numB = scan.nextLong();

        if(numA % numB == 0)
        {
            System.out.println("a divisao de " + numA + " por " + numB + " eh exata.");
        }
    }
}
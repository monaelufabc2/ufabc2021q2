import java.util.Scanner;

public class FatorialRec
{
    public static void main(String[] args)
    {
        int n;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        System.out.println(fatorial(n));
    }

    public static long fatorial(int n)
    {
        if(n == 0)
        {
            return 1l;
        }
        else
        {
            return n * fatorial(n-1);
        }
    }
}
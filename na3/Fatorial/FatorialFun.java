import java.util.Scanner;

public class FatorialFun
{
    public static void main(String[] args)
    {
        int n;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        while(n >= 0)
        {
            System.out.println(fatorial(n));
            n = scan.nextInt();
        }
    }

    public static long fatorial(int n)
    {
        int i;
        long fat = 1l;

        for(i=n; i>0; i--)
        {
            fat = fat * i;
        }
        return fat;
    }
}
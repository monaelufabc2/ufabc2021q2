/*0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...*/

import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        int n;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        System.out.println(fibonacci(n));
    }

    public static long fibonacci(int n)
    {
        int fiboAnt = 0, fiboAtu = 1, fiboProx, i;

        for(i=0; i<n-1; i++)
        {
            fiboProx = fiboAnt + fiboAtu;
            fiboAnt = fiboAtu;
            fiboAtu = fiboProx;
        }
        return fiboAnt;
    }
}
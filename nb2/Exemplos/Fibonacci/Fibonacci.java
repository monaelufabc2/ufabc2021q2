/* 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... */

import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        int n, i, fiboAnt = 0, fiboAtu = 1, fiboProx;
        Scanner scan = new Scanner(System.in);

        do
        {
            n = scan.nextInt();
        }while(n <= 0);

        for(i=0; i<n-1; i++)
        {
            fiboProx = fiboAnt + fiboAtu;
            fiboAnt = fiboAtu;
            fiboAtu = fiboProx;
        }
        System.out.println(fiboAnt);
    }
}
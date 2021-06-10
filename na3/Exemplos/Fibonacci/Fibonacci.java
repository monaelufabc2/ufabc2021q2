/*
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
*/

import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        int n, i, fiboAnt = 1, fiboAtu = 1, fiboProx;
        Scanner scan = new Scanner(System.in);

        do
        {
            n = scan.nextInt();
        }while(n <= 0);

        for(i=2; i<n; i++)
        {
            fiboProx = fiboAnt + fiboAtu;
            fiboAnt = fiboAtu;
            fiboAtu = fiboProx;
            /*
            if(i<n-1)
            {
                System.out.print(fiboAtu + " ");
            }
            else
            {
                System.out.println(fiboAtu);
            }
            */
        }
        System.out.println(fiboAtu);
    }
}
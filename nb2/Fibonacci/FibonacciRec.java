import java.util.Scanner;

public class FibonacciRec
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
        if(n==1)
        {
            return 0;
        }
        else if(n==2)
        {
            return 1;
        }
        else
        {
            return fibonacci(n-2) + fibonacci(n-1);
        }
    }
}
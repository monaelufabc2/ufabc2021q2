import java.util.Scanner;

public class Fatorial
{
    public static void main(String[] args)
    {
        int n;
        long fat = 1l;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        while(n > 0)
        {
            fat = fat * n;
            n = n - 1;
        }
        System.out.println(fat);
    }
}
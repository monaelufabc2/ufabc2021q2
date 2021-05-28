import java.util.Scanner;

public class Soma
{
    public static void main(String[] args)
    {
        int a, b, s;
        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();

        s = a + b;

        System.out.println(s);
    }
}
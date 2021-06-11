import java.util.Scanner;

public class Soma5
{
    public static void main(String[] args)
    {
        long num, soma = 0l;
        Scanner scan = new Scanner(System.in);

        num = scan.nextLong();
        while(num != 0l)
        {
            soma = soma + num;
            num = scan.nextLong();
        }
        System.out.println(soma);
    }
}
import java.util.Scanner;

public class Soma5
{
    public static void main(String[] args)
    {
        int num, soma = 0;
        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();
        while(num != 0)
        {
            soma = soma + num;
            num = scan.nextInt();
        }
        System.out.println(soma);
    }
}
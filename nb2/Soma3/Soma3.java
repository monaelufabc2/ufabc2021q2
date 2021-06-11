import java.util.Scanner;

public class Soma3
{
    public static void main(String[] args)
    {
        int num, soma = 0;
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext())
        {
            num = scan.nextInt();
            soma = soma + num;
        }

        System.out.println(soma);
    }
}
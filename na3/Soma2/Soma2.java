import java.util.Scanner;

public class Soma2
{
    public static void main(String[] args)
    {
        int n, i, soma = 0, num;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        for(i=0; i<n; i++)
        {
            num = scan.nextInt();
            soma = soma + num;
        }
        System.out.println(soma);
    }
}
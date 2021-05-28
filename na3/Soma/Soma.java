import java.util.Scanner;

public class Soma
{
    public static void main(String[] args)
    {
        int a, b, soma;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        soma = a + b;
        System.out.println(soma);
    }
}
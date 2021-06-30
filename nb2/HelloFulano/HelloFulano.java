import java.util.Scanner;

public class HelloFulano
{
    public static void main(String[] args)
    {
        String nome;
        Scanner scan = new Scanner(System.in);

        nome = scan.next();
        System.out.println("Ola " + nome + ", seja bem-vindo!");
    }
}
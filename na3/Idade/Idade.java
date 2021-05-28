import java.util.Scanner;

public class Idade
{
    public static void main(String[] args)
    {
        int anoAtual, anoNasc, idade;
        String nome;
        Scanner scan = new Scanner(System.in);

        anoAtual = scan.nextInt();
        nome = scan.next();
        anoNasc = scan.nextInt();

        idade = anoAtual - anoNasc;

        System.out.println(nome + ", voce completa " + idade + " anos de idade neste ano.");
    }
}
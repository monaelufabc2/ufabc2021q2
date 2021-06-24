import java.util.Scanner;

public class Referencia
{
    public static void main(String[] args)
    {
        Inteiro a = new Inteiro();
        Inteiro b = new Inteiro();
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        a.valor = scan.nextInt();
        System.out.print("Informe o valor de B: ");
        b.valor = scan.nextInt();

        System.out.println("ANTES DE VEZES10():");
        System.out.println("a: " + a.valor + " b: " + b.valor);
        vezes10(a, b);
        System.out.println("DEPOIS DE VEZES10():");
        System.out.println("a: " + a.valor + " b: " + b.valor);

    }

    public static void vezes10(Inteiro a, Inteiro b)
    {
        a.valor = a.valor * 10;
        b.valor = b.valor * 10;
    }
}

class Inteiro
{
    int valor;
}
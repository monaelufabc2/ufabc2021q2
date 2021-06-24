import java.util.Scanner;

public class Referencia
{
    public static void main(String[] args)
    {
        Inteiro a = new Inteiro();
        Inteiro b = new Inteiro();
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe A: ");
        a.valor = scan.nextInt();
        System.out.print("Informe B: ");
        b.valor = scan.nextInt();

        System.out.println("ANTES DE DOBRA(): ");
        System.out.println("A: " + a.valor + " B: " + b.valor);

        dobra(a, b);

        System.out.println("DEPOIS DE DOBRA(): ");
        System.out.println("A: " + a.valor + " B: " + b.valor);
    }

    public static void dobra(Inteiro a, Inteiro b)
    {
        a.valor = a.valor * 2;
        b.valor = b.valor * 2;
    }
}

class Inteiro
{
    int valor;
}
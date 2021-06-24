import java.util.Scanner;

public class Valor
{
    public static void main(String[] args)
    {
        int a, b;
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe A: ");
        a = scan.nextInt();
        System.out.print("Informe B: ");
        b = scan.nextInt();

        System.out.println("ANTES DE DOBRA(): ");
        System.out.println("A: " + a + " B: " + b);

        dobra(a, b);

        System.out.println("DEPOIS DE DOBRA(): ");
        System.out.println("A: " + a + " B: " + b);
    }

    public static void dobra(int a, int b)
    {
        a = a * 2;
        b = b * 2;
    }
}
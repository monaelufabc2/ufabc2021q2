import java.util.Scanner;

public class Valor
{
    public static void main(String[] args)
    {
        int a, b;
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        a = scan.nextInt();
        System.out.print("Informe o valor de B: ");
        b = scan.nextInt();

        System.out.println("ANTES DE VEZES10():");
        System.out.println("a = " + a + " b = " + b);
        vezes10(a, b);
        System.out.println("DEPOIS DE VEZES10():");
        System.out.println("a = " + a + " b = " + b);
    }

    public static void vezes10(int a, int b)
    {
        a = a * 10;
        b = b * 10;
    }
}
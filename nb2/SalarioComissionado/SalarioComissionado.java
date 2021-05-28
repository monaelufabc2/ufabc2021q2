import java.util.Scanner;

public class SalarioComissionado
{
    public static void main(String[] args)
    {
        float salFix, totVend, perComis, salario, vlComis;
        Scanner scan = new Scanner(System.in);

        salFix = scan.nextFloat();
        totVend = scan.nextFloat();
        perComis = scan.nextFloat();

        vlComis = (totVend * perComis) / 100f;
        salario = salFix + vlComis;

        System.out.printf("%.2f\n", salario);

    }
}
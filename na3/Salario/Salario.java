import java.util.Scanner;

public class Salario
{
    public static void main(String[] args)
    {
        float valHora, percDesc, salLiq, salBruto, valDesc;
        int qtdHoras;
        Scanner scan = new Scanner(System.in);

        valHora = scan.nextFloat();
        qtdHoras = scan.nextInt();
        percDesc = scan.nextFloat();

        salBruto = valHora * qtdHoras;
        valDesc = (salBruto * percDesc)/100f;
        salLiq = salBruto - valDesc;

        System.out.printf("%.2f\n", salLiq);
    }
}
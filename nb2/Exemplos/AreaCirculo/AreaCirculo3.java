import java.util.Scanner;

public class AreaCirculo3
{
    public static void main(String[] args)
    {
        float raio;
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor do raio: ");
        raio = scan.nextFloat();
        while(raio <= 0)
        {
            System.out.println("Valor " + raio + " invalido.\nInforme um valor positivo.");
            System.out.print("Informe o valor do raio: ");
            raio = scan.nextFloat();
        }

        System.out.printf("A area do circulo com raio %.2f eh %.2f.\n", raio, (Math.PI * Math.pow(raio, 2)));
    }
}
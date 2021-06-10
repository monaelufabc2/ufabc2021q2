import java.util.Scanner;

public class AreaCirculo2
{
    public static void main(String[] args)
    {
        float raio = -5949;
        Scanner scan = new Scanner(System.in);

        while(raio <= 0)
        {
            System.out.print("Informe o valor do raio: ");
            raio = scan.nextFloat();
        }

        System.out.printf("A area do circulo com raio %.2f eh %.2f.\n", raio, (Math.PI * Math.pow(raio, 2)));
    }
}
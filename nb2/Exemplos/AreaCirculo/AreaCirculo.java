import java.util.Scanner;

public class AreaCirculo
{
    public static void main(String[] args)
    {
        float raio;
        Scanner scan = new Scanner(System.in);

        do
        {
            System.out.print("Informe o valor do raio: ");
            raio = scan.nextFloat();
        }while(raio <= 0);

        System.out.printf("A area do circulo com raio %.2f eh %.2f.\n", raio, (Math.PI * Math.pow(raio, 2)));
    }
}
import java.util.Scanner;

public class AreaCirculo4
{
    public static void main(String[] args)
    {
        float raio = 0f;
        boolean primPasso = true;
        Scanner scan = new Scanner(System.in);

        do
        {
            if(!primPasso)
            {
                System.out.println("Valor " + raio + " invalido.\nInforme um valor positivo.");
            }
            primPasso = false;
            System.out.print("Informe o valor do raio: ");
            raio = scan.nextFloat();
        }while(raio <= 0);

        System.out.printf("A area do circulo com raio %.2f eh %.2f.\n", raio, (Math.PI * Math.pow(raio, 2)));
    }
}
/*
Faça um programa que calcule a área de um círculo dado o raio.
Se o valor do raio for negativo o programa deve pedir o valor
novamente.
*/

import java.util.Scanner;

public class AreaCirculo
{
    public static void main(String[] args)
    {
        float raio;
        Scanner scan = new Scanner(System.in);

        do
        {
            System.out.print("Informe o raio: ");
            raio = scan.nextFloat();
        }while(raio <= 0);

        System.out.printf("Area do circulo com raio %f eh %f\n", raio, (Math.PI * Math.pow(raio, 2)));
    }
}

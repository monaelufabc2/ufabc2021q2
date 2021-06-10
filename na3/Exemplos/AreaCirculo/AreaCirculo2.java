/*
Faça um programa que calcule a área de um círculo dado o raio.
Se o valor do raio for negativo o programa deve pedir o valor
novamente.
*/

import java.util.Scanner;

public class AreaCirculo2
{
    public static void main(String[] args)
    {
        float raio = -1;
        Scanner scan = new Scanner(System.in);

        while(raio <= 0)
        {
            System.out.print("Informe o raio: ");
            raio = scan.nextFloat();
        }

        System.out.printf("Area do circulo com raio %f eh %f\n", raio, (Math.PI * Math.pow(raio, 2)));
    }
}

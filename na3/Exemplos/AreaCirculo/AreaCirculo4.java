/*
Faça um programa que calcule a área de um círculo dado o raio.
Se o valor do raio for negativo o programa deve pedir o valor
novamente.
*/

import java.util.Scanner;

public class AreaCirculo4
{
    public static void main(String[] args)
    {
        float raio = 0f;
        boolean primPass = true;
        Scanner scan = new Scanner(System.in);

        do
        {
            if(!primPass)
            {
                System.out.println("Valor " + raio + " invalido.\nPor favor, informe um valor positivo.");
            }
            primPass = false;
            System.out.print("Informe o raio: ");
            raio = scan.nextFloat();
        }while(raio <= 0);

        System.out.printf("Area do circulo com raio %f eh %f\n", raio, (Math.PI * Math.pow(raio, 2)));
    }
}

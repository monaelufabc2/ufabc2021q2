import java.util.Scanner;

public class Triangulo5
{
    public static void main(String[] args)
    {
        float a1, a2, a3;
        int contador = 0;
        Scanner scan = new Scanner(System.in);

        do
        {
            a1 = scan.nextFloat();
            a2 = scan.nextFloat();
            a3 = scan.nextFloat();
            contador = contador + 1;
        }while(a1 + a2 + a3 != 180f);

        System.out.printf("Os angulos %.1f, %.1f e %.1f formam um triangulo.\n", a1, a2, a3);
        System.out.println("Foram necessarias " + contador + " tentativa para formar um triangulo.");
    }
}
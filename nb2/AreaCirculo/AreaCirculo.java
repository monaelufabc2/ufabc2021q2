import java.util.Scanner;

public class AreaCirculo
{
    public static void main(String[] args)
    {
        double raio, area;
        Scanner scan = new Scanner(System.in);

        raio = scan.nextDouble();

        area = 3.1415 * Math.pow(raio, 2);

        System.out.printf("A=%.4f\n", area);
    }
}
import java.util.Scanner;

public class PosicaoDaLetra
{
    public static void main(String[] args)
    {
        char letra;
        Scanner scan = new Scanner(System.in);

        letra = scan.next().charAt(0);

        System.out.println(letra - 'A'+1);
    }
}
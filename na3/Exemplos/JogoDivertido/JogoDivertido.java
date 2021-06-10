import java.util.Scanner;
import java.util.Random;

public class JogoDivertido
{
    public static void main(String[] args)
    {
        int numero, chute, qtdChutes;
        char resp;
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();

        do
        {
            numero = rd.nextInt(10)+1;
            qtdChutes = 0;
            do
            {
                System.out.print("Tente acertar o numero. Qual seu chute? ");
                chute = scan.nextInt();
                qtdChutes = qtdChutes + 1;
            }while(chute != numero);

            System.out.println("Parabens! Voce acertou com " + qtdChutes + " chutes.");

            do
            {
                System.out.print("Deseja se divertir novamente? [S]im [N]ao: ");
                resp = scan.next().charAt(0);
            }while(Character.toUpperCase(resp) != 'S' && Character.toUpperCase(resp) != 'N');
        }while(Character.toUpperCase(resp) == 'S');
    }
}
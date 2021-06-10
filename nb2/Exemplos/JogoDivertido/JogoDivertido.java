import java.util.Scanner;
import java.util.Random;

public class JogoDivertido
{
    public static void main(String[] args)
    {
        int sorteio, chute, qtdChutes;
        char resp;
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();

        do
        {
            sorteio = rd.nextInt(10)+1;
            qtdChutes = 0;

            do
            {
                System.out.print("Tente adivinhar o numero: ");
                chute = scan.nextInt();
                qtdChutes = qtdChutes + 1;
            }while(chute != sorteio);

            System.out.println("Parabens! Voce descobriu o numero sorteado com " + qtdChutes + " chutes.");

            do
            {
                System.out.print("Deseja continuar se divertindo pacas? [S]im ou [N]ao: ");
                resp = scan.next().charAt(0);
            }while(Character.toUpperCase(resp) != 'S' && Character.toUpperCase(resp) != 'N');
        }while(Character.toUpperCase(resp) == 'S');

        System.out.println("Poooxaaa!!! ... Ah! Some!");
    }
}
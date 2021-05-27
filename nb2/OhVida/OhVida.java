import java.util.Scanner;

public class OhVida
{
    public static void main(String[] args)
    {
        int tempo;
        String universidade;
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe quantos anos: ");
        tempo = scan.nextInt();
        System.out.print("Qual o nome da universidade: ");
        universidade = scan.next();
        System.out.println("Voce esta na " + universidade + " ha " + tempo + " anos.");
    }
}
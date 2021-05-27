import java.util.Scanner;

public class OhVida
{
    public static void main(String[] args)
    {
        int tempo;
        String universidade;
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o tempo: ");
        tempo = scan.nextInt();
        System.out.print("Informe o nome da universidade: ");
        universidade = scan.next();
        System.out.println("Voce estuda na " + universidade + " ha " + tempo + " anos.");
    }
}
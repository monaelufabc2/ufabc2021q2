import java.util.Scanner;

public class ConsoantesVogais
{
    public static void main(String[] args)
    {
        char letra;
        Scanner scan = new Scanner(System.in);

        letra = scan.next().charAt(0);

        if(Character.toUpperCase(letra) == 'A' || Character.toUpperCase(letra) == 'E' || Character.toUpperCase(letra) == 'I' || Character.toUpperCase(letra) == 'O' || Character.toUpperCase(letra) == 'U')
        {
            System.out.println("vogal");
        }
        else
        {
            System.out.println("consoante");
        }
    }
}
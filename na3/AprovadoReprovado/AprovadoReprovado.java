import java.util.Scanner;

public class AprovadoReprovado
{
    public static void main(String[] args)
    {
        float media;
        Scanner scan = new Scanner(System.in);

        media = scan.nextFloat();

        if(media >= 60f)
        {
            System.out.println("APROVADO");
        }
        else
        {
            System.out.println("REPROVADO");
        }
    }
}
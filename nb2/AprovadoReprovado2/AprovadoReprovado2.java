import java.util.Scanner;

public class AprovadoReprovado2
{
    public static void main(String[] args)
    {
        float nota1, nota2, media;
        Scanner scan = new Scanner(System.in);

        nota1 = scan.nextFloat();
        nota2 = scan.nextFloat();

        media = (nota1 + nota2) / 2f;

        if(media >= 60)
        {
            System.out.printf("Aluno APROVADO com media %.2f. Parabens!\n", media);
        }
        else if(media >= 40)
        {
            System.out.printf("Aluno em EXAME FINAL com media %.2f. Estude!\n", media);
        }
        else
        {
            System.out.printf("Aluno REPROVADO com media %.2f.\n", media);
        }
    }
}
import java.util.Scanner;

public class NotasEMedia
{
    public static void main(String[] args)
    {
        float nota, somaNotas = 0f;
        int i;
        Scanner scan = new Scanner(System.in);

        i = 0;
        while(i < 10)
        {
            System.out.println("Informe a " + (i+1) + "a. nota:");
            nota = scan.nextFloat();
            somaNotas = somaNotas + nota;
            i = i + 1;
        }
        System.out.printf("Sua Media Final dos Trabalhos (NFT) foi %.2f\n", (somaNotas/10f));
    }
}
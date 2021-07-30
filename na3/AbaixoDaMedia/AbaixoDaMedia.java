import java.util.Scanner;

public class AbaixoDaMedia
{
    public static void main(String[] args)
    {
        int n, i, j, qtdAlunosAbaixo;
        float notas[][], mediaAtiv;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        notas = new float[n][3];

        for(i=0; i<n; i++)
        {
            for(j=0; j<3; j++)
            {
                notas[i][j] = scan.nextFloat();
            }
        }

        for(j=0; j<3; j++)
        {
            mediaAtiv = mediaPorAtividade(notas, n, j);
            qtdAlunosAbaixo = 0;
            for(i=0; i<n; i++)
            {
                if(notas[i][j] < mediaAtiv)
                {
                    qtdAlunosAbaixo = qtdAlunosAbaixo + 1;
                }
            }
            System.out.println("Na " + (j+1) + "a. atividade " + qtdAlunosAbaixo + " alunos tiveram nota abaixo da media." );
        }

    }

    public static float mediaPorAtividade(float notas[][], int n, int j)
    {
        int i;
        float media = 0f;

        for(i=0; i<n; i++)
        {
            media = media + notas[i][j];
        }
        return media/n;
    }
}
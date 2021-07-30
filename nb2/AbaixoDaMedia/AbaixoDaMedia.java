/*Ler as três notas dos alunos desta sala e mostrar quantos
alunos obtiveram média aritmética simples individual abaixo
da média da sala. */

import java.util.Scanner;

public class AbaixoDaMedia
{
    public static void main(String[] args)
    {
        int n, i, j, qtdAlunosAbaixo;
        float notas[][], mediaAt;
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
            mediaAt = mediaAtividade(notas, n, j);
            qtdAlunosAbaixo = 0;
            for(i=0; i<n; i++)
            {
                if(notas[i][j] < mediaAt)
                {
                    qtdAlunosAbaixo = qtdAlunosAbaixo + 1;
                }
            }
            System.out.println("Na " + (j+1) + "a. atividade " + qtdAlunosAbaixo + " alunos tiveram nota abaixo da media.");
        }



    }

    public static float mediaAtividade(float m[][], int n, int j)
    {
        float media = 0f;
        int i;
        for(i=0; i<n; i++)
        {
            media = media + m[i][j];
        }
        return media/n;
    }
}

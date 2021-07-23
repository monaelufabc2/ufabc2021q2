import java.util.Scanner;

public class AulaCancelada
{
    public static void main(String[] args)
    {
        int n, k, i, tempos[];
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        k = scan.nextInt();
        tempos = new int[n];
        for(i=0; i<n; i++)
        {
            tempos[i] = scan.nextInt();
        }

        if(aulaCancelada(tempos, n, k))
        {
            System.out.println("SIM");
        }
        else
        {
            System.out.println("NAO");
        }
    }

    public static boolean aulaCancelada(int t[], int n, int k)
    {
        int qtdAlunos = 0, i;
        for(i=0; i<n; i++)
        {
            if(t[i] <= 0)
            {
                qtdAlunos = qtdAlunos + 1;
            }
        }
        return qtdAlunos < k;
    }
}
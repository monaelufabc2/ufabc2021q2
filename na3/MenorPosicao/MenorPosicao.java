import java.util.Scanner;

public class MenorPosicao
{
    public static void main(String[] args)
    {
        int n, i, vet[], posMenor;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        vet = new int[n];

        for(i=0; i<n; i++)
        {
            vet[i] = scan.nextInt();
        }

        posMenor = getIndiceMenor(vet, n);

        System.out.println("Menor valor: " + vet[posMenor]);
        System.out.println("Posicao: " + posMenor);
    }

    public static int getIndiceMenor(int[] v, int n)
    {
        int indMenor = 0, i;
        for(i=1; i<n; i++)
        {
            if(v[i] < v[indMenor])
            {
                indMenor = i;
            }
        }
        return indMenor;
    }
}
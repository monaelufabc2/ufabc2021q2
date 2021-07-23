import java.util.Scanner;

public class OrdenaTamanho
{
    public static void main(String[] args)
    {
        int n, i;
        String palavras[];
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        palavras = new String[n];
        for(i=0; i<n; i++)
        {
            palavras[i] = scan.next();
        }

        bubbleSortLength(palavras, n);

        for(i=0; i<n; i++)
        {
            System.out.println(palavras[i]);
        }
    }

    public static void bubbleSortLength(String[] s, int n)
    {
        int i, j;
        String aux;

        for(i=0; i<n-1; i++)
        {
            for(j=0; j<n-1-i; j++)
            {
                if(s[j].length() < s[j+1].length())
                {
                    aux = s[j];
                    s[j] = s[j+1];
                    s[j+1] = aux;
                }
            }
        }
    }
}
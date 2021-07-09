import java.util.Scanner;

public class SequenciaEspelho
{
    public static void main(String[] args)
    {
        int n, i, beg, end;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        for(i=0; i<n; i++)
        {
            beg = scan.nextInt();
            end = scan.nextInt();
            System.out.println(geraSequenciaEspelho(beg, end));
        }
    }

    public static String geraSequenciaEspelho(int b, int e)
    {
        int i;
        String seq = "";

        for(i=b; i<=e; i++)
        {
            seq = seq + i;
        }

        return seq+reverso(seq);
    }

    public static String reverso(String str)
    {
        int i;
        String revStr = "";

        for(i=str.length()-1; i>=0; i--)
        {
            revStr = revStr + str.charAt(i);
        }

        return revStr;
    }
}
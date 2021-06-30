import java.util.Random;

public class GeraEntrada
{
    public static void main(String[] args)
    {
        int n = Integer.valueOf(args[0]), i, m;
        Random rd = new Random();

        for(i=0; i<n-1; i++)
        {
            m = rd.nextInt(100)+1;
            System.out.println(geraNome(m) + " " + rd.nextInt(m));
        }
        m = rd.nextInt(100)+1;
        System.out.print(geraNome(m) + " " + rd.nextInt(m));
    }

    public static String geraNome(int tamanho)
    {
        String nome = "";
        int i;
        Random rd = new Random();

        for(i=0; i<tamanho; i++)
        {
            nome = nome + (char)('a' + rd.nextInt(26));
        }
        return nome;
    }
}
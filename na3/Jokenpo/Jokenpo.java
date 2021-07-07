import java.util.Scanner;

public class Jokenpo
{
    public static void main(String[] args)
    {
        int n, i;
        String jog1, jog2;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        for(i=0; i<n; i++)
        {
            jog1 = scan.next();
            jog2 = scan.next();
            System.out.println(resultadoJokenpo(jog1, jog2));
        }
    }

    public static String resultadoJokenpo(String j1, String j2)
    {
        if( j1.compareTo("pedra")==0 && j2.compareTo("tesoura")==0 ||
            j1.compareTo("papel")==0 && j2.compareTo("pedra")==0 ||
            j1.compareTo("tesoura")==0 && j2.compareTo("papel")==0 )
        {
            return "jogador 1";
        }
        else if(j1.compareTo(j2) == 0)
        {
            return "empate";
        }
        else
        {
            return "jogador 2";
        }
    }
}
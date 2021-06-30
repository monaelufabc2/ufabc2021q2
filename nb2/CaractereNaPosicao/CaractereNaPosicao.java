import java.util.Scanner;

public class CaractereNaPosicao
{
    public static void main(String[] args)
    {
        String str;
        int pos;
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext())
        {
            str = scan.next();
            pos = scan.nextInt();
            System.out.println(caractereNaPosicao(str, pos));
        }
    }

    public static char caractereNaPosicao(String s, int p)
    {
        return s.charAt(p);
    }
}
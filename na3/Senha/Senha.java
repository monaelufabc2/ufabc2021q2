import java.util.Scanner;

public class Senha
{
    public static void main(String[] args)
    {
        int senha, dig1, dig2, dig3, dig4;
        Scanner scan = new Scanner(System.in);

        senha = scan.nextInt();

        dig1 = senha % 10;
        senha = senha / 10;
        dig2 = senha % 10;
        senha = senha / 10;
        dig3 = senha % 10;
        dig4 = senha / 10;

        if(dig1 == 0 || dig2 == 0 || dig3 == 0 || dig4 == 0)
        {
            System.out.println("NAO");
        }
        else
        {
            System.out.println("SIM");
        }
    }
}
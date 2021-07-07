import java.util.Scanner;

public class Tuitando
{
    public static void main(String[] args)
    {
        int totLetras = 0;
        String txt="";
        Scanner scan = new Scanner(System.in);

        txt = scan.nextLine();
        if(txt.length() <= 140)
        {
            System.out.println("TWEET");
        }
        else
        {
            System.out.println("MUTE");
        }
    }
}
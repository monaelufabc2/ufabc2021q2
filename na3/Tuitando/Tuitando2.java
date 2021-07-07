import java.util.Scanner;

public class Tuitando2
{
    public static void main(String[] args)
    {
        int totLetras = 0;
        String txt="";
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext())
        {
            txt = scan.next();
            totLetras = totLetras + txt.length() + 1;
        }

        if(totLetras <= 140)
        {
            System.out.println("TWEET");
        }
        else
        {
            System.out.println("MUTE");
        }
    }
}
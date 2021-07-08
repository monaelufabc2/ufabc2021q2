import java.util.Scanner;

public class Spirit
{
    public static void main(String[] args)
    {
        int qtdErr = 0, i;
        String msg;
        Scanner scan = new Scanner(System.in);

        msg = scan.next();

        for(i=0; i<msg.length(); i=i+3)
        {
            if(msg.charAt(i) != 'S')
            {
                qtdErr = qtdErr + 1;
            }
            if(msg.charAt(i+1) != 'O')
            {
                qtdErr = qtdErr + 1;
            }
            if(msg.charAt(i+2) != 'S')
            {
                qtdErr = qtdErr + 1;
            }
        }
        System.out.println(qtdErr);
    }
}
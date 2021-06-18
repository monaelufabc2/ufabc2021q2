import java.util.Scanner;

public class Esquerda
{
    public static void main(String[] args)
    {
        int n, i;
        char com;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        for(i=0; i<n; i++)
        {
            com = scan.next().charAt(0);
            System.out.println(com);
        }
    }
}
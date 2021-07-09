import java.util.Scanner;

public class Exemplo
{
    public static void main(String[] args)
    {
        String p1, p2;
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext())
        {
            p1 = scan.nextLine();
            p2 = scan.nextLine();

            if(p1.compareTo(p2) > 0)
            {
                System.out.println(p1 + " vem depois de " + p2);
            }
            else if(p1.compareTo(p2) < 0)
            {
                System.out.println(p2 + " vem depois de " + p1);
            }
            else
            {
                System.out.println(p1 + " e " + p2 + " sao iguais");
            }
            System.out.println(p1.compareTo(p2));
        }
    }
}
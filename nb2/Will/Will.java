import java.util.Scanner;

public class Will
{
    public static void main(String[] args)
    {
        int n, lamp, i;
        String alpha;
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext())
        {
            alpha = scan.next();
            n = scan.nextInt();
            for(i=0; i<n; i++)
            {
                lamp = scan.nextInt();
                System.out.print(alpha.charAt(lamp-1));
            }
            System.out.println();
        }
    }
}
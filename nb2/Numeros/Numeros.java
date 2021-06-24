import java.util.Scanner;

public class Numeros
{
    public static void main(String[] args)
    {
        int num, resp;
        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();
        while(num != -1)
        {
            resp = classificaNumero(num);
            if(resp == 1)
            {
                System.out.println("abundante");
            }
            else if(resp == 2)
            {
                System.out.println("perfeito");
            }
            else
            {
                System.out.println("deficiente");
            }
            num = scan.nextInt();
        }
    }

    public static int classificaNumero(int n)
    {
        int i, somaDivisores = 0;
        for(i=1; i<n; i++)
        {
            if(n%i == 0)
            {
                somaDivisores = somaDivisores + i;
            }
        }
        if(somaDivisores > n)
        {
            return 1;
        }
        else if(somaDivisores < n)
        {
            return 3;
        }
        else
        {
            return 2;
        }
    }
}
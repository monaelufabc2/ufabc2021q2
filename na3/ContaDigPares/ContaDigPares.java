import java.util.Scanner;

public class ContaDigPares
{
    public static void main(String[] args)
    {
        int num, qtdDigPares;
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext())
        {
            num = scan.nextInt();
            qtdDigPares = contaDigitosPares(num);
            System.out.println(qtdDigPares);
        }
    }

    public static int contaDigitosPares(int n)
    {
        int qtdPar, dig;

        if(n == 0)
        {
            qtdPar = 1;
        }
        else
        {
            qtdPar = 0;
        }

        while(n > 0)
        {
            dig = n % 10;
            if(dig % 2 == 0)
            {
                qtdPar = qtdPar + 1;
            }
            n = n / 10;
        }
        return qtdPar;
    }
}
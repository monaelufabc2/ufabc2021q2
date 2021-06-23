import java.util.Scanner;

public class Misterio
{
    public static void main(String []args)
    {
        int x, y;
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        y = scan.nextInt();
        System.out.println("x = " + x + " y = " + y + " misterio() = " + misterio(x, y));
    }

    public static int misterio(int x, int y)
    {
        while(x>0)
        {
            y=magica(y);
            x=ilusao(x);
        }
        return y;
    }

    public static int magica(int x)
    {
        return x+1;
    }

    public static int ilusao(int x)
    {
        return x-1;
    }
}

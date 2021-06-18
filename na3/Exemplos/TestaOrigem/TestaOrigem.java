import java.util.Random;

public class TestaOrigem
{
    public static void main(String[] args)
    {
        int a, b, c, delta;
        float x;
        Random rd = new Random();

        do
        {
            a = 0;//rd.nextInt() * (rd.nextInt(100)<20?-1:1);
            b = rd.nextInt() * (rd.nextInt(100)<30?-1:1);
            c = 0;//rd.nextInt() * (rd.nextInt(100)<20?-1:1);
            delta = b*b - 4*a*c;
            x = (-b)/(2f*a);
            System.out.println(a + "x^2 +" + b + "x +" + c + " = 0 : delta: " + delta + " x: " + x);
        }while(x != 0f);

        System.out.println(a + " " + b + " " + c);
    }
}
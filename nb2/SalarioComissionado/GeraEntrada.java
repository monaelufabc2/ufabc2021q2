import java.util.Random;

public class GeraEntrada
{
    public static void main(String[] args)
    {
        int salInt, salRe, venInt, venRe, perInt, perRe;
        Random rd = new Random();

        salInt = rd.nextInt(100001);
        salRe = rd.nextInt(100);
        venInt = rd.nextInt(100001);
        venRe = rd.nextInt(100);
        perInt = rd.nextInt(101);

        if(perInt < 100)
        {
            perRe = rd.nextInt(100);
        }
        else
        {
            perRe = 0;
        }
        System.out.print(salInt + "." + salRe + " " + venInt + "." + venRe + " " + perInt + "." + perRe);
    }
}
import java.util.Random;

public class GeraEntrada
{
    public static void main(String[] args)
    {
        int vlHoraInt, vlHoraReal, qtHoras, percDescInt, percDescReal;
        Random rd = new Random();

        vlHoraInt = rd.nextInt(1001);
        vlHoraReal = rd.nextInt(100);
        qtHoras = rd.nextInt(721);
        percDescInt = rd.nextInt(101);

        if(percDescInt < 100)
        {
            percDescReal = rd.nextInt(100);
        }
        else
        {
            percDescReal = 0;
        }

        System.out.print(vlHoraInt + "." + vlHoraReal + " " + qtHoras + " " + percDescInt + "." + percDescReal);
    }
}
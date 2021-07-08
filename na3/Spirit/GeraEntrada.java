import java.util.Random;

public class GeraEntrada
{
    public static void main(String[] args)
    {
        int n, i;
        Random rd = new Random();
        String msg = "";

        do
        {
            n = rd.nextInt(99)+1;
        }while(n%3!=0);

        for(i=0; i<n/3; i++)
        {
            msg = msg + geraSOS();
        }
        System.out.println(msg);
    }

    public static String geraSOS()
    {
        int sort, i;
        Random rd = new Random();
        String msg;

        sort = rd.nextInt(100);

        if(sort < 40)
        {
            msg = "SOS";
        }
        else if(sort < 80)
        {
            msg = "";
            for(i=0; i<3; i++)
            {
                if(rd.nextBoolean())
                {
                    msg = msg + "S";
                }
                else
                {
                    msg = msg + "O";
                }
            }
        }
        else
        {
            msg = "";
            for(i=0; i<3; i++)
            {
                msg = msg + (char)('A'+rd.nextInt(26));
            }
        }
        return msg;
    }
}
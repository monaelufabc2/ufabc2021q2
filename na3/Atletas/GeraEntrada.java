import java.util.Random;

public class GeraEntrada
{
    public static void main(String[] args)
    {
        int i;
        Random rd = new Random();

        for(i=0; i<100; i++)
        {
            System.out.println(rd.nextInt(91)+10);
            System.out.println(rd.nextInt(3) + "." + rd.nextInt(100));
            System.out.println(rd.nextInt(100) + "." + rd.nextInt(100));

            if(i<99)
            {
                if(args[0].compareTo("A") == 0)
                {
                    System.out.println(rd.nextBoolean()?"M":"F");
                }
                else
                {
                    System.out.println(args[0]);
                }
            }
            else
            {
                if(args[0].compareTo("A") == 0)
                {
                    System.out.print(rd.nextBoolean()?"M":"F");
                }
                else
                {
                    System.out.print(args[0]);
                }
            }
        }
    }
}
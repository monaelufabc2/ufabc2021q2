public class NumerosPares100
{
    public static void main(String[] args)
    {
        int i = 1;
        while(i <= 100)
        {
            if(i%2==0)
            {
                if(i < 100)
                {
                    System.out.print(i + " ");
                }
                else
                {
                    System.out.println(i);
                }
                //System.out.print(i + (i<100?" ":"\n"));
            }
            i = i + 1;
        }
    }
}
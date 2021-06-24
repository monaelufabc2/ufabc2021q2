public class GeraTodasEntradas
{
    public static void main(String[] args)
    {
        int i = 1;
        while(i < 32768)
        {
            System.out.println(i);
            i = i + 1;
        }
        System.out.print(-1);
    }
}
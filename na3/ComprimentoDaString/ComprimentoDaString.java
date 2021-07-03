import java.util.Scanner;

public class ComprimentoDaString
{
    public static void main(String[] args)
    {
        String str;
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext())
        {
            str = scan.next();
            System.out.println(comprimentoDaString(str));
        }
    }

    public static int comprimentoDaString(String s)
    {
        return s.length();
    }
}
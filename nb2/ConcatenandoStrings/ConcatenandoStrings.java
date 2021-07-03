import java.util.Scanner;

public class ConcatenandoStrings
{
    public static void main(String[] args)
    {
        String str1, str2;
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext())
        {
            str1 = scan.next();
            str2 = scan.next();

            System.out.println(concatenacaoDeStrings(str1, str2));
        }
    }

    public static String concatenacaoDeStrings(String str1, String str2)
    {
        return str1.concat(str2);
    }
}
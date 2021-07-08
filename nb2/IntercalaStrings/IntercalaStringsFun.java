import java.util.Scanner;

public class IntercalaStringsFun
{
    public static void main(String[] args)
    {
        int n1, n2;
        String s1, s2;
        Scanner scan = new Scanner(System.in);

        n1 = scan.nextInt();
        s1 = scan.next();
        n2 = scan.nextInt();
        s2 = scan.next();

        System.out.println(intercalaStrings(s1, s2));
    }

    public static String intercalaStrings(String s1, String s2)
    {
        int i, j, k;
        String sr = "";

        for(i=0, j=0, k=0; i<s1.length() && j<s2.length(); k++)
        {
            if(s1.charAt(i) < s2.charAt(j))
            {
                sr = sr + s1.charAt(i);
                i = i + 1;
            }
            else
            {
                sr = sr + s2.charAt(j);
                j = j + 1;
            }
        }

        for(;i<s1.length(); i++, k++)
        {
            sr = sr + s1.charAt(i);
        }

        for(;j<s2.length(); j++, k++)
        {
            sr = sr + s2.charAt(j);
        }

        return sr;
    }
}
import java.util.Scanner;

public class Senha5
{
    public static void main(String[] args)
    {
        String password;
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext())
        {
            password = scan.next();
            if(isValidPassword(password))
            {
                System.out.println("Senha valida.");
            }
            else
            {
                System.out.println("Senha invalida.");
            }
        }
    }

    public static boolean isValidPassword(String p)
    {
        int i;
        boolean temDig = false, temMaiusc = false, temMinus = false, temSimb = false;
        for(i=0; i<p.length(); i++)
        {
            if(Character.isDigit(p.charAt(i)))
            {
                temDig = true;
            }

            if(Character.isUpperCase(p.charAt(i)))
            {
                temMaiusc = true;
            }
            else
            {
                temMinus = true;
            }

            if(!Character.isLetterOrDigit(p.charAt(i)))
            {
                temSimb = true;
            }
        }

        return temDig && temMaiusc && temMinus && !temSimb;
    }
}
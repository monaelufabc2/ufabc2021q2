import java.util.Scanner;

public class Ultima
{
    public static void main(String[] args)
    {
        boolean primeiro = true;
        String nome, ultNome = "";
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext())
        {
            nome = scan.nextLine();
            if(primeiro || nome.compareToIgnoreCase(ultNome) > 0)
            {
                primeiro = false;
                ultNome = nome;
            }
        }
        System.out.println(ultNome);
    }
}
import java.util.Scanner;

public class IdadeMaisVelho
{
    public static void main(String[] args)
    {
        int idade1, idade2;
        Scanner scan = new Scanner(System.in);

        idade1 = scan.nextInt();
        idade2 = scan.nextInt();

        System.out.println(idade1>idade2?idade1:idade2);

        /*
        if(idade1 > idade2)
        {
            System.out.println(idade1);
        }
        else
        {
            System.out.println(idade2);
        }*/

    }
}
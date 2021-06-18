import java.util.Scanner;

public class Datas2
{
    public static void main(String[] args)
    {
        int d, m, a;
        Scanner scan = new Scanner(System.in);

        d = scan.nextInt();
        m = scan.nextInt();
        a = scan.nextInt();

        if(d>0 && m>0 && ((d <= 30 && (m==4 || m==6 || m==9 || m==11)) || (d <= 31 && (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)) || (d<=28 && m==2) || (m==2 && d==29 && (a%400 == 0 || a%100!=0 && a%4==0))))
        {
            System.out.println("DATA VALIDA");
        }
        else
        {
            System.out.println("DATA INVALIDA");
        }
    }
}
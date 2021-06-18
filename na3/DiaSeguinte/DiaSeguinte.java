import java.util.Scanner;

public class DiaSeguinte
{
    public static void main(String[] args)
    {
        int dia, mes, ano, i, n;
        Scanner scan = new Scanner(System.in);

        dia = scan.nextInt();
        mes = scan.nextInt();
        ano = scan.nextInt();

        dia = dia + 1;

        if(!(dia>0 && mes>0 && ((dia <= 30 && (mes==4 || mes==6 || mes==9 || mes==11)) || (dia <= 31 && (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)) || (dia<=28 && mes==2) || (mes==2 && dia==29 && (ano%400 == 0 || ano%100!=0 && ano%4==0)))))
        {
            dia = 1;
            mes = mes + 1;
            if(!(dia>0 && mes>0 && ((dia <= 30 && (mes==4 || mes==6 || mes==9 || mes==11)) || (dia <= 31 && (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)) || (dia<=28 && mes==2) || (mes==2 && dia==29 && (ano%400 == 0 || ano%100!=0 && ano%4==0)))))
            {
                mes = 1;
                ano = ano + 1;
            }
        }

        System.out.println(dia + " " + mes + " " + ano);
    }
}
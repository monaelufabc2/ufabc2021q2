import java.util.Scanner;

public class Atletas
{
    public static final int TAMANHO = 100;

    public static void main(String[] args)
    {
        int idades[] = new int[TAMANHO], i, qtdMasc = 0, qtdFem = 0, qtdMascAcimaAlt = 0, qtdFemAbaixoPeso = 0;
        float alturas[] = new float[TAMANHO], somaAltMasc = 0f, mediaAltMasc = 0f;
        float pesos[] = new float[TAMANHO], somaPesoFem = 0f, mediaPesoFem = 0f;
        char generos[] = new char[TAMANHO];
        Scanner scan = new Scanner(System.in);

        for(i=0; i<TAMANHO; i++)
        {
            //System.out.print("Informe a idade do " + (i+1) + "o. atleta: ");
            idades[i] = scan.nextInt();
            //System.out.print("Informe a altura do " + (i+1) + "o. atleta: ");
            alturas[i] = scan.nextFloat();
            //System.out.print("Informe o peso do " + (i+1) + "o. atleta: ");
            pesos[i] = scan.nextFloat();
            //System.out.print("Informe o genero do " + (i+1) + "o. atleta: ");
            generos[i] = scan.next().charAt(0);

            if(generos[i] == 'M')
            {
                somaAltMasc = somaAltMasc + alturas[i];
                qtdMasc = qtdMasc + 1;
            }
            else
            {
                somaPesoFem = somaPesoFem + pesos[i];
                qtdFem = qtdFem + 1;
            }
        }

        if(qtdMasc != 0)
        {
            mediaAltMasc = somaAltMasc/qtdMasc;
        }
        if(qtdFem != 0)
        {
            mediaPesoFem = somaPesoFem/qtdFem;
        }

        for(i=0; i<TAMANHO; i++)
        {
            if(generos[i] == 'M' && alturas[i] > mediaAltMasc)
            {
                qtdMascAcimaAlt = qtdMascAcimaAlt + 1;
            }
            if(generos[i] == 'F' && pesos[i] < mediaPesoFem)
            {
                qtdFemAbaixoPeso = qtdFemAbaixoPeso + 1;
            }
        }

        if(qtdMasc != 0)
        {
            System.out.println("Ha " + qtdMascAcimaAlt + " atletas homens acima da media da altura dos homens.");
        }
        else
        {
            System.out.println("Nao houve entrada de atletas homens.");
        }

        if(qtdFem != 0)
        {
            System.out.println("Ha " + qtdFemAbaixoPeso + " atletas mulheres abaixo da media do peso das mulheres.");
        }
        else
        {
            System.out.println("Nao houve entrada de atletas mulheres.");
        }
    }
}
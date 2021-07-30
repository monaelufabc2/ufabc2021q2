import java.util.Random;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;


public class GeraEntrada
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        int nArq = Integer.valueOf(args[0]), iArq, n, i, j, notaInt, notaReal;
        String nomeArq, str;
        Random rd = new Random();
        OutputStream arq, scr = new FileOutputStream("script.sh");
        OutputStreamWriter arqW, scrW = new OutputStreamWriter(scr);
        BufferedWriter arqBuf, scrBuf = new BufferedWriter(scrW);

        for(iArq=0; iArq<nArq; iArq++)
        {
            nomeArq = "file" + iArq;
            arq = new FileOutputStream(nomeArq);
            arqW = new OutputStreamWriter(arq);
            arqBuf = new BufferedWriter(arqW);

            n = rd.nextInt(1000)+1;
            arqBuf.write(n + "\n");
            for(i=0; i<n; i++)
            {
                for(j=0; j<3; j++)
                {
                    notaInt = rd.nextInt(11);
                    if(notaInt != 10)
                    {
                        notaReal = rd.nextInt(100);
                    }
                    else
                    {
                        notaReal = 0;
                    }
                    str = notaInt + ".";
                    if(notaReal < 10)
                    {
                        str = str + "0" + notaReal;
                    }
                    else
                    {
                        str = str + notaReal;
                    }
                    str = str + (j<2?" ":"\n");
                    arqBuf.write(str);
                }
            }
            arqBuf.close();
            scrBuf.write("java AbaixoDaMedia < input/" + nomeArq + " > output/" + nomeArq + "\n");
        }
        scrBuf.close();
    }
}
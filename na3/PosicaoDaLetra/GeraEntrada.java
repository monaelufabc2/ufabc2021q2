import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class GeraEntrada
{
    public static void main(String[] args) throws IOException, FileNotFoundException
    {
        OutputStream arq, script = new FileOutputStream("script.sh");
        OutputStreamWriter arqW, scriptW = new OutputStreamWriter(script);
        BufferedWriter arqBuf, scriptBuf = new BufferedWriter(scriptW);
        String nomeArq;
        int i;

        for(i=0; i<26; i++)
        {
            nomeArq = "file" + i;
            arq = new FileOutputStream(nomeArq);
            arqW = new OutputStreamWriter(arq);
            arqBuf = new BufferedWriter(arqW);

            arqBuf.write('A'+i);
            arqBuf.close();
            scriptBuf.write("java PosicaoDaLetra < input/" + nomeArq + " > output/" + nomeArq + "\n");
        }
        scriptBuf.close();
    }
}
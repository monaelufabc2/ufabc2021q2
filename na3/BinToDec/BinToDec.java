import java.util.Scanner;

public class BinToDec
{
    public static void main(String[] args)
    {
        String numBin;
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext())
        {
            numBin = scan.next();
            System.out.println(bin2Dec(numBin));
        }
    }

    public static long bin2Dec(String nBin)
    {
        long nDec = 0l;
        int i;

        for(i=nBin.length()-1; i>=0; i--)
        {
            nDec = nDec + (long)(Character.digit(nBin.charAt(i), 10) * Math.pow(2, nBin.length()-i-1));
        }

        return nDec;
    }
}
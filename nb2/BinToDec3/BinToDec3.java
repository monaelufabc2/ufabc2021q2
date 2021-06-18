import java.util.Scanner;

public class BinToDec3
{
    public static void main(String[] args)
    {
        long nBin, nDec = 0l, dig;
        int i = 0;
        Scanner scan = new Scanner(System.in);

        nBin = scan.nextLong();

        while(nBin != 0l)
        {
            dig = nBin%10l;
            nDec = nDec + (long)(dig * Math.pow(2, i));
            nBin = nBin/10l;
            i = i + 1;
        }
        System.out.println(nDec);
    }
}
package Lab2;
import java.io.*;
public class Macierz {
    private static int [][] WczytajMacierz(int n, int m, String nazwa)
    {
        int [][]macierz=new int[n][m];
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
            {
                try
                {
                    System.out.print(nazwa+"["+i+"]["+j+"]=");
                    String s=in.readLine();
                    macierz[i][j]=Integer.parseInt(s);
                }
                catch(Exception e)
                {
                    System.err.println("To nie jest liczba calkowita");
                    if(j>0)j--;
                    else
                    {
                        j=m;
                        i--;
                    }
                }
            }
        return macierz;
    }
    private static void Wyswietl(int [][]macierz,String nazwa)
    {
        int n=macierz.length;
        int m=macierz[0].length;
        System.out.println(nazwa+":");
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
                System.out.print(""+macierz[i][j]+"\t");
            System.out.println();
        }
    }
    private static int [][] Odwroc(int [][]macierz)
    {int [][]macierzpom=new int[macierz[0].length][macierz.length];
        for( int i=0; i<macierz.length; i++)
            for(int j=0; j<macierz[0].length;j++)
                macierzpom[j][i]=macierz[i][j];
        return macierzpom;
    }
    public static void main(String[] args)
    {
        int [][]macierz=WczytajMacierz(2,3,"macierz");
        Wyswietl(macierz,"Macierz wczytana z klawiatury");
        System.out.println();
        Wyswietl(Odwroc(macierz),"Macierz transponowana");
    }
}

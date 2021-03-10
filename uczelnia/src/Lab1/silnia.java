package Lab1;
import java.io.*;
public class silnia {
    //Funkcja obliczająca rekurencje
    private static long silnia(int n)
    {
        if(n==0) return 1;
        else return n*silnia(n-1);

    }

    public static void main(String[] args) {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program oblicza n!");
        System.out.print("n=");
        try
        {
            String s=in.readLine();
            int n=Integer.parseInt(s);
            if (n>=0)
            {
                //obliczanie silni
                long sil=silnia(n);
                //wypisanie
                System.out.println(n+"!="+sil);
            }
            else
            {
                //wypisanie bledu
                System.err.println("Blad! To nie jest liczba nieujmena");
            }
        }
        catch(Exception e)
        {
            System.err.println("Blad! Niewlasciwy format danych");
        }
    }
}


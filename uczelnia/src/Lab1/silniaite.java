package Lab1;
import java.io.*;

public class silniaite {
    //Funkcja obliczająca rekurencje
    private static long silnia(int n)
    {int suma=1;
        if(n==0) return 1;

        else{
            for (int i = 1; i <= n; i++) {
                suma += suma * i;

            }
        }
        return suma;
    }

    public static void main(String[] args) {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

        boolean sukces=false;
        while (!sukces) {
            System.out.println("Program oblicza n!");
            System.out.print("n=");
            try {

                String s = in.readLine();

                int n = Integer.parseInt(s);

                if (n >= 0) {
                    //obliczanie silni
                    long sil = silnia (n);
                    //wypisanie
                    System.out.println(n + "!=" + sil);
                    sukces= true;
                } else {
                    //wypisanie bledu
                    System.err.println("Blad! To nie jest liczba nieujmena");
                }
            } catch (Exception e) {
                System.err.println("Blad! Niewlasciwy format danych");
                sukces=false;
            }
        }
    }
}

package Lab1;
import java.io.*;
public class Switch {
    private static double potegarek(double a, int n)
    {
        if(n==0) return 1;
        else return a*potegarek(a,n-1);

    }
    private static double potegaite(double a, double n)
    { double suma=1;
        if(n==0) return 1;
        else {

            for (int i = 1; i <= n; i++) {
                suma *= a;
            }
        }
        return suma;
    }
    private static long silniarek(int n)
    {
        if(n==0) return 1;
        else return n*silniarek(n-1);

    }

    //Funkcja obliczająca rekurencje
    private static long silniaire(int n)
    {int suma=1;
        if(n==0) return 1;

        else{
            for (int i = 1; i <= n; i++) {
                suma += suma * i;

            }
        }
        return suma;
    }


    public static void main(String[]args) throws IOException
    { BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

        boolean sukces=false;
        while(!sukces) {
            System.out.println("1.Potega rekurencyjna \n2.Potega iteracyjna\n3.Silnia rekurencyjna\n4.Silnia iteracyjna\nWybierz numer : ");
            int wybor = Integer.parseInt(in.readLine());

            switch (wybor)
            { case 1 :
                double a;
                int n;
                System.out.print("Podaj podstawe a= ");
                a = Double.parseDouble(in.readLine());
                System.out.print("Podaj wykladnik n= ");
                n = Integer.parseInt(in.readLine());
                if (n >= 0) {
                    double c = potegarek(a, n);
                    System.out.println(a + " do potegi " + n + "=" + c);
                    sukces=true;
                }
                else {
                    System.err.println("Blad! WYkladnik nie moze byc ujemny");
                }
                break;
                case 2:
                    double podstawa;
                    System.out.print("Podaj podstawe a= ");
                    podstawa = Double.parseDouble(in.readLine());
                    System.out.print("Podaj wykladnik n= ");
                    n = Integer.parseInt(in.readLine());
                    if (n >= 0) {
                        double c = potegaite(podstawa, n);
                        System.out.println(podstawa + " do potegi " + n + "=" + c);
                        sukces=true;
                    }
                    else {
                        System.err.println("Blad! WYkladnik nie moze byc ujemny");
                    }
                    break;
                case 3:
                    System.out.print("Podaj liczbe do silni rekurencyjnej ");
                    n =Integer.parseInt(in.readLine());
                    if (n>=0)
                    {
                        //obliczanie silni
                        long sil=silniarek(n);
                        //wypisanie
                        System.out.println(n+"!="+sil);
                        sukces=true;
                    }
                    else
                    {
                        //wypisanie bledu
                        System.err.println("Blad! To nie jest liczba nieujmena");
                    }
                    break;
                case 4:
                    System.out.print("Podaj liczbe do silni iteracyjnej ");
                    n =Integer.parseInt(in.readLine());
                    if (n >= 0) {
                        //obliczanie silni
                        long sil = silniaire (n);
                        //wypisanie
                        System.out.println(n + "!=" + sil);
                        sukces= true;
                    } else {
                        //wypisanie bledu
                        System.err.println("Blad! To nie jest liczba nieujmena");
                    }
                    break;
                default:
                    break;



            }
        }
    }
}

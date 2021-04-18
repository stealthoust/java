package Lab3;
import java.io.*;
import static java.lang.Math.*;
public class Wektor3D {
    public double X, Y, Z;
    private String nazwa;

    public Wektor3D(double x, double y, double z, String nazwa) {
        X = x;
        Y = y;
        Z = z;
        this.nazwa = nazwa;
    }

    public Wektor3D(Punkt3D poczatek, Punkt3D koniec, String nazwa) {
        this.X = koniec.X - poczatek.X;
        this.Y = koniec.Y - poczatek.Y;
        this.Z = koniec.Z - poczatek.Z;
        this.nazwa = nazwa;
    }

    public Wektor3D(String nazwa) {
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.nazwa = nazwa;
    }

    private void Suma(Wektor3D a,    Wektor3D b) {
        this.X = a.X + b.X;
        this.Y = a.Y + b.Y;
        this.Z = a.Z + b.Z;

    }

    private void Roznica(Wektor3D a, Wektor3D b) {
        this.X = a.X - b.X;
        this.Y = a.Y - b.Y;
        this.Z = a.Z - b.Z;

    }

    private double WczytajParametr(String nazwa) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print(nazwa + "=");
            String s = in.readLine();
            double zmienna = Double.parseDouble(s);
            return zmienna;
        } catch (Exception e) {
            System.err.println("Blad! To nie jest liczba!");
            return WczytajParametr(nazwa);
        }
    }
    protected void WczytajWektor()
    {
        System.out.println("Podaj wspolrzedne wektora "+nazwa+":");
        X=WczytajParametr("X");
        Y=WczytajParametr("Y");
        Z=WczytajParametr("Z");
    }
    public void Wyswietl()
    {
        System.out.println("Wektor "+nazwa+":");
        System.out.println("X="+X);
        System.out.println("Y="+Y);
        System.out.println("Z="+Z);
    }

    public static Wektor3D Suma(Wektor3D a, Wektor3D b, String nazwa) {
        Wektor3D wynik = new Wektor3D("wynikowy");
        wynik.Suma(a,b);
        return wynik;
    }
    public static Wektor3D Roznica(Wektor3D a, Wektor3D b, String nazwa)
    {Wektor3D wynik = new Wektor3D("wynikowy");
        wynik.Roznica(a,b);
        return wynik;
    }
    public double dlugoscWektora(Wektor3D wekt)
    { double dlugosc;
        dlugosc= pow(wekt.X,2)+pow(wekt.Y,2)+pow(wekt.Z,2);

        return sqrt(dlugosc);
    }

}



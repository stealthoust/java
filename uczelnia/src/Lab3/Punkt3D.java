package Lab3;
import java.io.*;
public class Punkt3D {
    public double X,Y,Z;
    private String nazwa;
    public Punkt3D(double x,double y,double z)
    {
        X=x;Y=y;Z=z;
        nazwa="";
    }
    public Punkt3D(double x,double y,double z, String nazwa)
    {
        X=x;Y=y;Z=z;
        this.nazwa=nazwa;
    }
    private double WczytajDouble(String nazwa)
    {
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.print(nazwa+"=");
            String s=in.readLine();
            double zmienna =Double.parseDouble(s);
            return zmienna;
        }
        catch(Exception e)
        {
            System.err.println("Blad! To nie jest liczba!");
            return WczytajDouble(nazwa);
        }
    }
    private void WczytajPunkt()
    {
        System.out.println("Podaj wspolrzedne punktu "+nazwa+":");
        X=WczytajDouble("X");
        Y=WczytajDouble("Y");
        Z=WczytajDouble("Z");
    }
    public Punkt3D(String nazwa)
    {
        this.nazwa=nazwa;
        WczytajPunkt();
    }
    public void Wyswietl()
    {
        System.out.println("Punkt "+nazwa+":");
        System.out.println("X="+X);
        System.out.println("Y="+Y);
        System.out.println("Z="+Z);
    }

}



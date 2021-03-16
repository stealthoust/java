package Lab4;

import java.io.*;
public class Czlowiek implements IKonsola{
    private String imie;
    private String nazwisko;
    private String adres;
    private int wiek;
    private Plec plec;
    private String pesel;

    public Czlowiek(String imie,String nazwisko, Plec plec,String adres, int wiek, String pesel)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.adres=adres;
        this.wiek=wiek;
        this.plec=plec;
        this.pesel=pesel;
    }
    public Czlowiek() {}
    protected String WczytajString(String nazwa)
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.print(nazwa+": ");
            String s=in.readLine();
            if(s.length()>0)
                return s;
            else
                    return WczytajString(nazwa);
        }
        catch(Exception e)
        {
            return WczytajString(nazwa);
        }
    }
    protected int WczytajInt(String nazwa)
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.print(nazwa+"=");
            String s=in.readLine();
            int zmienna=Integer.parseInt(s);
            return zmienna;
        }
        catch (Exception e)
        {
            System.err.println("Blad! To nie jest liczba!");
            return WczytajInt(nazwa);
        }
    }
    public void Wczytaj()
    {
        this.imie=WczytajString("Imie");
        this.nazwisko=WczytajString("Nazwisko");
        boolean sukces=false;
        do {
            String p=WczytajString("Plec(M/K)");
                p=p.toUpperCase();
                if(p.charAt(0)=='M')
                {
                    this.plec=Plec.M;
                    sukces=true;
                }
                if(p.charAt(0)=='K')
                {
                    this.plec=Plec.K;
                    sukces=true;
                }
        }
        while(!sukces);
        this.adres=WczytajString("Adres");
        this.wiek=WczytajInt("Wiek");
        this.pesel=WczytajString("Pesel");
        }
        public void Wyswietl()
        {
            System.out.println("Imie: "+this.imie);
            System.out.println("Nazwisko: "+this.nazwisko);
            System.out.println("Plec: "+this.plec);
            System.out.println("Adres: "+this.adres);
            System.out.println("Wiek: "+this.wiek);
            System.out.println("Pesel: "+this.pesel);
        }
        public boolean equals (Object o)
        {
            Czlowiek c=(Czlowiek)o;
            if(pesel.equals(c.pesel))
                return true;
            else
                return false;
        }
    }


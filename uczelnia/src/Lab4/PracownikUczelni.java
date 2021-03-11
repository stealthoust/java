package Lab4;

public class PracownikUczelni extends Czlowiek{
    private String tytul;
    private String stanowisko;
    private float pensja;
    public PracownikUczelni(String imie,String nazwisko,Plec plec,String adres,int wiek,String pesel,String tytul,
                            String stanowisko,float pensja)
    {
        super(imie,nazwisko,plec,adres,wiek,pesel);
        this.tytul=tytul;
        this.stanowisko=stanowisko;
        this.pensja=pensja;
    }
    public PracownikUczelni() {}
    public void Wczytaj()
    {
        System.out.println("Wczytywanie danych pracownika ");
        super.Wczytaj();
        this.tytul=WczytajString("tytul");
        this.stanowisko=WczytajString("stanowisko");
        this.pensja=WczytajInt("pensja");
    }
}

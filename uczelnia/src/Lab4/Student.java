package Lab4;

public class Student extends Czlowiek {
    private int semestr;
    private String album;
    public Student(String imie, String nazwisko, Plec plec, String adres, int wiek, String pesel, int semestr, String album)
    {
        super(imie,nazwisko,plec,adres,wiek,pesel);
        this.semestr=semestr;
        this.album=album;
    }
    public Student() {}

    public void Wczytaj()
    {
        System.out.println("Wczytywanie danych studenta ");
        super.Wczytaj();
        this.semestr=WczytajInt("Semestr");
        this.album=WczytajString("Album") ;

    }

    public void Wyswietl()
    {
        System.out.println("Wyswietlanie danych o Studencie");
        super.Wyswietl();
        System.out.println("Semestr: "+semestr);
        System.out.println("Album: "+album);
        System.out.println();
    }

}

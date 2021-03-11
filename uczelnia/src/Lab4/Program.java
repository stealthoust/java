package Lab4;

public class Program {

    public static void main(String[] args)

    {
        Student s=new Student("Alicja","Kowalska",Plec.K,"Warszawa,F.Szopena 80",
                21,"80010100000",5,"AA007");
        s.Wyswietl();
        System.out.println("Porownanie obiektow klas: Student i Czlowiek");
        Czlowiek c=new Czlowiek("Alicja","Kowalska",Plec.K,"Warszawa,F.Szopena 80",21,"80010100000");
        System.out.println("(s==c = "+(s.equals(c)));

        Czlowiek c1=new Czlowiek("Alicja","Kowalska",Plec.K,"Krakow,J.Tuwima 10",21,"80030311111");
        System.out.println("(c==c1) = "+(c.equals(c1)));

        Student s1=new Student();

        PracownikUczelni p= new PracownikUczelni("Pawel","Juras",Plec.M,
                "Rzeszow,Langiewicza 15",37,"88221144142","Doktor", "Wykladowca",3200);
        PracownikUczelni p2=new PracownikUczelni();
        p2.Wczytaj();
        p2.Wyswietl();

        s1.Wczytaj();
        System.out.println("(s==s1 = "+(s.equals(s1))  );
    }
}

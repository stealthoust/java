package Lab4;
import java.util.*;
public class Program {

    public static void main(String[] args)

    {
        /*Student s=new Student("Alicja","Kowalska",Plec.K,"Warszawa,F.Szopena 80",
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
        System.out.println("(s==s1 = "+(s.equals(s1))  ); */

      /*  Object o;
        Random generator=new Random();
        int losowa=generator.nextInt(3);
        switch(losowa)
        {
            case 0:
                o=new Czlowiek("Izabela","Nowak",Plec.K,"Rzeszow Langiewicza 14",20,"" +
                        "12312312312");
                break;
            case 1:
                o=new PracownikUczelni("Krzysztof","Kowalski",Plec.M,"Jaroslaw Pilsudskiego 20"
                , 45,"34534534534","dr.inz","profesor",3000);
                break;
            default:
                o=new Student("Alicja","Krajewska",Plec.K,"Wolomin Kacprowicza 11",19,"67867867867",
                        3,"s20201");
                break;
        }
        ((IKonsola)o).Wyswietl(); */
        Student s1=new Student("Alicja","Kowalska",Plec.K,"Warszawa,F.Szopena 80",
                21,"80010100000",5,"AA007");
        Student s2=new Student("Alicja","Kowalska",Plec.K,"Warszawa,F.Szopena 80",
                21,"80010100000",6,"AA007");
if (s1.compareTo(s2)==0)
{
    System.out.println("Semestr obu obiektow jest taki sam ");
}
else System.out.println("Semestr obu obiektow rozni sie");

    }
}

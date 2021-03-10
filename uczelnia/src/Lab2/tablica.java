package Lab2;
import java.io.*;
public class tablica {
    private static int[] WczytajTab(int n)
    {
        int []tab=new int[n];
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int wczytano=0;
        System.out.println("Podaj "+n+" liczb");
        while(wczytano<n)
        {
            try
            {
                System.out.print((wczytano+1)+":\t");
                String s=in.readLine();
                tab[wczytano]=Integer.parseInt(s);
                wczytano++;
            }
            catch(Exception e)
            {
                System.err.println("To nie jest liczba calkowita");
            }

        }
        return tab;
    }
    private static void Wyswietl(int []tab, String nazwa)
    {
        System.out.println("Zawartosc tablicy "+nazwa+":");
        for(int i=0;i<tab.length;i++)
            System.out.println(nazwa+"["+i+"]="+tab[i]);
    }
    private static void Odwroc(int []tab, String nazwa)
    {int j=0;
        int pomocnicza;
        while(j<tab.length/2)
        {pomocnicza=tab[tab.length-(j+1)];
            tab[tab.length-(j+1)]=tab[j];
            tab[j]=pomocnicza;
            j++;
        }
        for(int i=0;i<tab.length;i++)
            System.out.println(nazwa+"["+i+"]="+tab[i]);
       /* Wyswietlenie tablicy od konca
       System.out.println("Zawartosc tablicy "+nazwa+":");
        for(int i=tab.length-1;i>=0;i--)
            System.out.println(nazwa+"["+i+"]="+tab[i]);*/
    }

    private static int[] Odwrocistworz(int []tab)
    {int []tabpomocnicza=new int[tab.length];
        for(int i=0;i<tab.length;i++)
        {
            tabpomocnicza[i]=tab[tab.length-(i+1)];
        }
        return tabpomocnicza;
    }

    private static int[] Sumuj(int []tab1, int []tab2)
    { int []tabpomocnicza=new int[tab1.length];
        int i=0;
        while(i<tab1.length)
        {
            tabpomocnicza[i]=tab1[i]+tab2[i];
            i++;
        }
        return tabpomocnicza;
    }
    public static void main(String[] args)
    {
        int []tab1={1,2,3,4,5};
        Wyswietl(tab1,"tab1");
        int []tab2=WczytajTab(5); //wczytanie do tablicy wartosci
        int []tab3=Odwrocistworz(tab2); // SPOSOB 2, stworzenie nowej tablicy i przypisanie do nich wartosci od konca z tablicy drugiej
        // Wyswietl(tab3,"tab3");
        // Odwroc(tab2,"tab2"); // Sposob 1, odwrocenie tablicy
        Wyswietl(Sumuj(tab1,tab2),"tabPomocnicza"); // Sumowanie dwoch tablic
    }
}

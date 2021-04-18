package Lab6;
import javax.swing.*;

public class Zadanie1 extends JFrame{


public Zadanie1(int szerokosc, int wysokosc, String nazwa)
{
    super(nazwa);
    this.setSize(szerokosc,wysokosc);
    this.show();

}
    public static void main(String[] args)

    {
        Zadanie1 okno=new Zadanie1(500,800,"Moj tekst");


    }
}

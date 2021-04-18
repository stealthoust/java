import java.awt.*;
import javax.swing.*;
public class Kombinacje_4_5 extends JFrame{
    JPanel panel,panel2;
    JLabel poludnie,wschod,zachod;
    JButton b1,b2,b3,b4,b5,b6;
    public Kombinacje_4_5(int szerokosc, int wysokosc, String nazwa)
    {
        super(nazwa);
        this.setSize(szerokosc,wysokosc);
        panel2=new JPanel();
        panel2.setLayout(new FlowLayout());
        b4=new JButton("przycisk 4");
        b5=new JButton("przycisk 5");
        b6=new JButton("przycisk 6");
        panel2.add(b4);
        panel2.add(b5);
        panel2.add(b6);

        poludnie=new JLabel("poludnie");
        wschod=new JLabel("wschod");
        zachod=new JLabel("zachod");
        panel=new JPanel();
        panel.setLayout(new GridLayout(3,3));
        b1=new JButton("przycisk 1");
        b2=new JButton("przycisk 2");
        b3=new JButton("przycisk 3");

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);

        add(BorderLayout.CENTER,panel);
        add(BorderLayout.NORTH,panel2);
        add(BorderLayout.SOUTH,poludnie);
        add(BorderLayout.EAST,wschod);
        add(BorderLayout.WEST,zachod);

        this.show();
    }
    public static void main(String[] args) {
        Kombinacje_4_5 zadanie4=new Kombinacje_4_5(500,300,"kombinacja menedzerow");

    }
}
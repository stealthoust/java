package Lab6;
import java.awt.*;
import javax.swing.*;
public class RozkladGrid extends JFrame {

    JButton b;
    JLabel l;
    JCheckBox c;
    JRadioButton r1,r2;
    ButtonGroup g;
    JTextArea ta;
    JTextField tf;

    public RozkladGrid(int szerokosc, int wysokosc, String nazwa)
    {
        super(nazwa);
        this.setSize(szerokosc,wysokosc);
        this.setLayout(new GridLayout(7,2));
        b=new JButton("przycisk");
        c=new JCheckBox("pole wyboru");
        l=new JLabel("etykieta");
        r1=new JRadioButton("przycisk radiowy 1");
        r2=new JRadioButton("przycisk radiowy 2");
        JButton button = new JButton("Button 1 (PAGE_START)");
        g=new ButtonGroup();
        g.add(r1);
        g.add(r2);
        ta=new JTextArea("obszar tekstowy");
        tf=new JTextField("pole tekstowe");
        add(b);
        add(c);
        add(l);
        add(r1);
        add(r2);
        add(ta);
        add(tf);
        add(BorderLayout.WEST,r1);
        add(BorderLayout.EAST,r2);
        this.show();

    }

    public static void main(String[] args)
    {

        new RozkladGrid(500,300,"Rozklad GridLayout");

    }
}

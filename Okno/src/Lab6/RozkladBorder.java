package Lab6;
import java.awt.*;
import javax.swing.*;
public class RozkladBorder extends JFrame {

    JButton b;
    JLabel l;
    JCheckBox c;
    JRadioButton r1,r2;
    ButtonGroup g;
    JTextArea ta;
    JTextField tf;

    public RozkladBorder(int szerokosc, int wysokosc, String nazwa)
    {
        super(nazwa);
        this.setSize(szerokosc,wysokosc);
        this.setLayout(new BorderLayout(3,4));
        b=new JButton("przycisk");
        c=new JCheckBox("pole wyboru");
        l=new JLabel("etykieta");
        r1=new JRadioButton("przycisk radiowy 1");
        r2=new JRadioButton("przycisk radiowy 2");

        g=new ButtonGroup();
        g.add(r1);
        g.add(r2);
        ta=new JTextArea("obszar tekstowy");
        tf=new JTextField("pole tekstowe");
        add(BorderLayout.SOUTH,b);
        add(BorderLayout.SOUTH,c);
        add(BorderLayout.NORTH,l);
        add(BorderLayout.LINE_END,ta);
        add(BorderLayout.SOUTH,tf);
        add(BorderLayout.CENTER,r1);
        add(BorderLayout.LINE_START,r2);
        this.show();

    }

    public static void main(String[] args)
    {

        new RozkladBorder(500,300,"Rozklad BorberLayout");

    }
}

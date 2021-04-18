package Lab5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Okno2 extends Frame implements WindowListener,ActionListener {


    Button przycisk1 = new Button("Pierwszy przycisk");
    Button przycisk2 = new Button("Drugi przycisk") ;
    Button przycisk3 = new Button("Trzeci przycisk") ;
    Button przycisk4 = new Button("Czwarty przycisk") ;
    Button przycisk5 = new Button("Piaty przycisk") ;


    public Okno2(GraphicsConfiguration gc) {
        super(gc);
    }

    public Okno2(String title) throws HeadlessException {
        super(title);
    }

    public Okno2(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }

    public Okno2() throws HeadlessException {
        super();
        setBounds(1250,250,500,250);
        setVisible(true);
        this.addWindowListener(this);

        przycisk1.addActionListener(this) ;
        przycisk1.setBounds(200,50,100,25);
        przycisk1.setVisible(true);
        add(przycisk1);
        this.setLayout(null);

        przycisk2.addActionListener(this);
        przycisk2.setBounds(50,50,100,25);
        przycisk2.setVisible(true);
        add(przycisk2);

        przycisk3.addActionListener(this);
        przycisk3.setBounds(100,100,100,25);
        przycisk3.setVisible(true);
       add(przycisk3);

        przycisk4.addActionListener(this);
        przycisk4.setBounds(150,150,100,25);
        przycisk4.setVisible(true);
        add(przycisk4);

        przycisk5.addActionListener(this);
        przycisk5.setBounds(200,200,100,25);
        przycisk5.setVisible(true);
        add(przycisk5);

przycisk1.setActionCommand("pierwszy");
przycisk2.setActionCommand("drugi");
przycisk3.setActionCommand("trzeci");
        przycisk4.setActionCommand("czwarty");
        przycisk5.setActionCommand("piaty");

    }


    public static void main(String[] args) {

Okno2 o2 = new Okno2() ;

    }








    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getActionCommand()==("pierwszy"))
{
    setTitle("pierwszy");
}
else if(e.getActionCommand()==("drugi"))
{
    setTitle("drugi");
}
else if(e.getActionCommand()==("trzeci"))
{
    setTitle("trzeci");
}

else if(e.getActionCommand()==("czwarty"))
{
    setTitle("czwarty");
}

else if(e.getActionCommand()==("piaty"))
{
    setTitle("piaty");
}
//przycisk1.setLocation(przycisk1.getX()+5,przycisk1.getY()+5);
//setTitle("Przycisk wcisniety");
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}

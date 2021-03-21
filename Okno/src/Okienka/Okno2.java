package Okienka;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Okno2 extends Frame implements WindowListener,ActionListener {

    Button przycisk = new Button("Przycisk");

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

        przycisk.addActionListener(this);
        przycisk.setBounds(100,50,200,25);
        przycisk.setVisible(true);
        add(przycisk);
        this.setLayout(null);






    }


    public static void main(String[] args) {

Okno2 o2 = new Okno2() ;

    }








    @Override
    public void actionPerformed(ActionEvent e) {

przycisk.setLocation(przycisk.getX()+5,przycisk.getY()+5);
setTitle("Przycisk wcisniety");
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

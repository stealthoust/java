package Okienka;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Okno2 extends Frame implements WindowListener, ActionListener {


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
        setBounds(10,10,400,400);
        setVisible(true);
        this.addWindowListener(this);
        Button przycisk = new Button("Przycisk");
        przycisk.setBounds(40,40,20,30);
        przycisk.setVisible(true);
        add(przycisk);

    }


    public static void main(String[] args) {

Okno2 o2 = new Okno2() ;
    }








    @Override
    public void actionPerformed(ActionEvent e) {

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

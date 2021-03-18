package com.company;

import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Okno extends Frame implements WindowListener{

    public Okno() throws HeadlessException
    {
 super();
 setBounds(10,10,400,400);
 setVisible(true);
 this.addWindowListener(this);
    }

    public static void main(String[] args) {
	Okno o= new Okno();

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

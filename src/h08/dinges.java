package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class dinges extends Applet {
    TextField tekstvak;
    Label label;
    double getal;



    public void init() {
        tekstvak = new TextField("typ aleen cijfers", 20);
        label= new Label("check die cijfers");
        tekstvak.addActionListener( new Textvaklistener() );
        add(tekstvak);
        add(label);

    }

    public void paint(Graphics g) {
        g.drawString("het getal is " + (int) getal,50,60);
    }
    class Textvaklistener implements ActionListener{
        public void actionPerformed (ActionEvent e) {
            String s= tekstvak.getText();
            getal =Double.parseDouble( s );
            repaint();
        }
    }

}


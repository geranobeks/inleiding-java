package h13;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;


public class Practice4 extends Applet{

    int gesteente;

    public void init() {
        setSize(600,600);
        gesteente=1;
        Button knop1 = new Button("baksteen");
        Button knop2 = new Button("beton");
        Listener1 l1 = new Listener1();
        Listener2 l2 = new Listener2();
        knop1.addActionListener(l1);
        knop2.addActionListener(l2);
        add(knop1);
        add(knop2);
    }

    public void paint(Graphics g) {

        if(gesteente==0) {

            for(int teller=0; teller <10; teller++) {

                for(int teller1=0; teller1<10; teller1++) {
                    Steen(g, teller*22+10*(teller1%2),(teller1+5)*12);
                }
            }
        }
        else if(gesteente==1) {

            for(int teller=0; teller <10; teller++) {

                for(int teller1=0; teller1<10; teller1++) {
                    Beton(g, teller*42+20*(teller1%2),(teller1+5)*22);
                }
            }
        }
    }
    public class Listener1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            gesteente=0;
            repaint();
        }

    }

    public class Listener2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            gesteente=1;
            repaint();
        }
    }

    void Steen (Graphics g, int x1, int y1) {
        g.setColor(Color.red);
        g.fillRect(x1, y1, 20,10);
    }

    void Beton (Graphics g, int x1, int y1) {
        g.setColor(Color.gray);
        g.fillRect(x1, y1, 40,20);
    }
}
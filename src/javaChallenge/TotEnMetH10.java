package javaChallenge;

import java.applet.Applet;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class TotEnMetH10 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int uur;
    int Tokyo;
    int London;
    int NewYork;
    int Sydney;
    Button tijdknop;
    int x;
    int y;

    public void init() {
        setSize(450, 500);
        TekstvakListener tl = new TekstvakListener();
        tekstvak = new TextField("", 20);
        label = new Label("Voer een uur in");
        tekstvak.addActionListener(tl);
        tekst = "";
        tijdknop = new Button("Toon Tijden");
        tijdknop.addActionListener(tl);
        add(label);
        add(tekstvak);
        add(tijdknop);

    }

    public void paint(Graphics g) {
        x= 50;
        y= 110;
        if (Tokyo > 30 || NewYork > 32 || London > 22 || Sydney > 17) {
            g.drawString("foutmelding", x, y);

        } else
            if (Tokyo < 0) {

                Tokyo = 24 + Tokyo;
            }
            if (NewYork < 0) {

                NewYork = 24 + NewYork;
            }
            if (London < 0) {

                London = 24 + London;
            }
            if (Sydney < 0) {

                Sydney = 24 + Sydney;
            }
            if (Sydney < 0) {

                Sydney = Sydney - 24;
            }
            if (London < 0) {

                London = London - 24;
            }
            if (NewYork < 0) {

                NewYork = NewYork - 24;
            }
            if (Tokyo < 0) {

                Tokyo = Tokyo - 24;

            }

            y = +15;
            g.drawString("Tokyo:" + Tokyo + ":00", x, y);
            y = +15;
            g.drawString("London:" + London + ":00", x, y);
            y = +15;
            g.drawString("New York:" + NewYork + ":00", x, y);
            y = +15;
            g.drawString("Sydney:" + Sydney + ":00", x, y);


        }

        class TekstvakListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                s = tekstvak.getText();
                Tokyo = Integer.parseInt(s);
                Tokyo = 7 + Tokyo;

                s = tekstvak.getText();
                NewYork = Integer.parseInt(s);
                NewYork = NewYork - 6;

                s = tekstvak.getText();
                London = Integer.parseInt(s);
                London = London - 1;

                s = tekstvak.getText();
                Sydney = Integer.parseInt(s);
                Sydney = 9 + Sydney;

                repaint();


            }
        }
    }

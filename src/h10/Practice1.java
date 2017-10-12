package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practice1 extends Applet {
    int hoogstegetal;
    int invoer;
    TextField tekstvak;
    String tekst;


    public void init() {
        setSize(600,300);
        tekstvak = new TextField("de bedoeling is dat de hoogste getal onderaan getoond wordt", 50);
        Tekstvaklistener kl = new Tekstvaklistener();
        tekstvak.addActionListener(kl);
        add(tekstvak);
        tekst = "";

    }


    public void paint(Graphics g) {
        g.drawString("het hooggste getal is: " + hoogstegetal,20,50);
    }

    class Tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            invoer = Integer.parseInt(s);
            if (hoogstegetal < invoer) {
                hoogstegetal = invoer;
                repaint();

            }
        }
    }

}

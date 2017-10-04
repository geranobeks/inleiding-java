package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Practice3 extends Applet {
    TextField tekstvak;
    Label label;
    Button Okknop;
    double BTW;


    public void init() {
        tekstvak = new TextField("", 14);
        label = new Label("bereken uw btw");
        Okknop = new Button("OK");
        Okknop.addActionListener(new KnopListener());
        tekstvak.addActionListener(new KnopListener());
        add(tekstvak);
        add(label);
        add(Okknop);



    }

    public void paint(Graphics g) {
        g.drawString("de uitkomst is: " + (BTW*1.21), 40, 70);
    }


    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s= tekstvak.getText();
            BTW= Double.parseDouble(s);
            repaint();
        }
    }
}

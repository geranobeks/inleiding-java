package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class Practice5 extends Applet {
    TextField tekstvak;
    String s, resultaat;
    Button button;
    double cijfer;
    double totaal;
    int AantalInvoer;
    double gemiddelde;


    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TekstvakListener());
        button = new Button("OK");
        button.addActionListener(new TekstvakListener());
        resultaat = "";
        add(tekstvak);
        add(button);

    }

    public void paint(Graphics g) {
        g.drawString(resultaat, 50, 60);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Double.parseDouble(s);

            if (cijfer == 1 || cijfer == 2 || cijfer == 3 || cijfer == 4 || cijfer == 5 || cijfer == 6) {
                resultaat = "onvoldoende";
            } else if (cijfer == 7 || cijfer == 8 || cijfer == 9 || cijfer == 10) {
                resultaat = "voldoende";
            } else {
                resultaat = "Foutmedling; Null";
            }
            repaint();
        }
    }
}


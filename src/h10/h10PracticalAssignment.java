package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class h10PracticalAssignment extends Applet {
    TextField tekstvak;
    String s, resultaat;
    Button button;
    int cijfer;

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
            cijfer = Integer.parseInt(s);
            switch (cijfer) {
                case 1:
                case 2:
                case 3:
                    resultaat = "Slecht";
                break;

                case 4:
                    resultaat = "onvoldoende";
                break;

                case 5:
                    resultaat = "Matig";
                break;

                case 6:
                case 7:
                    resultaat = "Voldoende";
                break;

                case 8:
                case 9:
                case 10:
                    resultaat = "Goed";
                break;

                default:
                    resultaat = "Foutmelding; Null";

            }
            repaint();
        }
    }
}




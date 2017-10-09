package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class h8PracticalAssignment extends Applet {
    TextField getalvak1;
    TextField getalvak2;
    Button MinKnop;
    Button PlusKnop;
    Button KeerKnop;
    Button DeelKnop;
    double Getal1;
    double Getal2;


    public void init() {
        getalvak1 = new TextField("", 14);
        getalvak2 = new TextField("", 14);

        PlusKnop = new Button("+");
        PlusKnop.addActionListener(new PlusKnopListener());
        MinKnop = new Button("-");
        MinKnop.addActionListener(new MinKnopListener());
        KeerKnop = new Button("x");
        KeerKnop.addActionListener(new KeerKnopListener());
        DeelKnop = new Button(":");
        DeelKnop.addActionListener(new DeelKnopListener());
        add(getalvak1);
        add(getalvak2);
        add(PlusKnop);
        add(MinKnop);
        add(KeerKnop);
        add(DeelKnop);


    }


    class PlusKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String a = getalvak1.getText();
            Getal1 = Double.parseDouble(a);
            String b = getalvak2.getText();
            Getal2 = Double.parseDouble(b);
            double uitkomst = Getal1 + Getal2;
            getalvak1.setText(String.valueOf(uitkomst));
            getalvak2.setText("");

        }
    }

    class MinKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String c = getalvak1.getText();
            Getal1 = Double.parseDouble(c);
            String d = getalvak2.getText();
            Getal2 = Double.parseDouble(d);
            double uitkomst = Getal1- Getal2;
            getalvak1.setText(String.valueOf(uitkomst));
            getalvak2.setText("");

        }
    }

    class KeerKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String f = getalvak1.getText();
            Getal1 = Double.parseDouble(f);
            String g = getalvak2.getText();
            Getal2 = Double.parseDouble(g);
            double uitkomst = Getal1 * Getal2;
            getalvak1.setText(String.valueOf(uitkomst));
            getalvak2.setText("");

        }
    }

    class DeelKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String h = getalvak1.getText();
            Getal1 = Double.parseDouble(h);
            String i = getalvak2.getText();
            Getal2 = Double.parseDouble(i);
            double uitkomst = Getal1 / Getal2;
            getalvak1.setText(String.valueOf(uitkomst));
            getalvak2.setText("");


        }
    }
}



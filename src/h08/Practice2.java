package h08;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Practice2 extends Applet{

    Button man;
    Button vrouw;
    Button man2;
    Button vrouw2;
    int teller;
    int teller2;
    int teller3;
    int teller4;
    int totaal;


        public void init() {
            setSize(500, 600);
            KnopListener kl = new KnopListener();

            man = new Button("M");
            man.addActionListener(kl);
            vrouw = new Button("V");
            vrouw.addActionListener(new Vrouw());
            man2 = new Button("M2");
            man2.addActionListener(new Man2());
            vrouw2 = new Button("V2");
            vrouw2.addActionListener(new Vrouw2());
            teller = 0;
            teller2 =0;
            teller3 = 0;
            teller4 = 0;
            add(man);
            add(vrouw);
            add(man2);
            add(vrouw2);


        }


        public void paint(Graphics g) {
            g.drawString("aantal mannelijke ouders" + teller, 20, 50);
            g.drawString("aantal vrouwelijke ouders" + teller2, 20, 65);
            g.drawString("aantal mannelijke potentiële studenten" + teller3, 20, 80);
            g.drawString("aantal vrouwelijke potentiële stundenten" + teller4, 20, 95);
            g.drawString("Totaal" + totaal , 20, 110);
            totaal= teller + teller2 + teller3 + teller4;

        }

        class KnopListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                teller++;
                totaal++;
                repaint();

            }
        }

        class Vrouw implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                teller2++;
                totaal++;
                repaint();
            }
        }

        class Man2 implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                teller3++;
                totaal++;
                repaint();
            }
        }

        class Vrouw2 implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                teller4++;
                totaal++;
                repaint();

            }
        }


    }




package h12;

import java.applet.Applet;
import java.awt.*;

public class Practice1 extends Applet {
    double getal[] ={12, 24, 19, 92, 28, 13, 34, 56, 78, 3} ;

    public void init() {

        setSize(500, 400);
    }

    public void paint(Graphics g) {

        double gemiddelde = 0.0;

        for (int teller = 0; teller < getal.length; teller++){

            g.drawString("" + getal[teller], 50, 20 * teller + 20);
            gemiddelde += getal[teller];

      }
         gemiddelde /= getal.length;
        g.drawString("Gemidelde: " + gemiddelde, 50, 220);
    }
}

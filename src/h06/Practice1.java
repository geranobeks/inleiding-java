package h06;

import java.applet.Applet;
import java.awt.*;

public class Practice1 extends Applet{


        public void init () {


        }

    public void paint(Graphics g) {
        int calc = 113/4;
        g.drawString("113 gesplit voor 4 personen "+ calc, 20, 10);
        g.drawString("Jan:€"+calc, 20, 30);
        g.drawString("Ali:€"+calc, 20, 45);
        g.drawString("Jeanneette:€"+calc, 20, 60);
        g.drawString("Assat 99:€"+calc, 20, 75);
    }
}

